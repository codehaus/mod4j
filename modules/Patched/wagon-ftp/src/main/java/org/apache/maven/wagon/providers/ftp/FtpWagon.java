package org.apache.maven.wagon.providers.ftp;

/*
 * Copyright 2001-2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.net.ProtocolCommandEvent;
import org.apache.commons.net.ProtocolCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.maven.wagon.ConnectionException;
import org.apache.maven.wagon.InputData;
import org.apache.maven.wagon.OutputData;
import org.apache.maven.wagon.PathUtils;
import org.apache.maven.wagon.ResourceDoesNotExistException;
import org.apache.maven.wagon.StreamWagon;
import org.apache.maven.wagon.TransferFailedException;
import org.apache.maven.wagon.WagonConstants;
import org.apache.maven.wagon.authentication.AuthenticationException;
import org.apache.maven.wagon.authentication.AuthenticationInfo;
import org.apache.maven.wagon.authorization.AuthorizationException;
import org.apache.maven.wagon.repository.RepositoryPermissions;
import org.apache.maven.wagon.resource.Resource;

public class FtpWagon
    extends StreamWagon
{
    private FTPClient ftp;

    public void openConnection()
        throws ConnectionException, AuthenticationException
    {
        AuthenticationInfo authInfo = getAuthenticationInfo();

        if ( authInfo == null )
        {
            throw new IllegalArgumentException( "Authentication Credentials cannot be null for FTP protocol" );
        }

        if ( authInfo.getUserName() == null )
        {
            authInfo.setUserName( System.getProperty( "user.name" ) );
        }

        String username = authInfo.getUserName();

        String password = authInfo.getPassword();

        String host = getRepository().getHost();

        ftp = new FTPClient();

        ftp.addProtocolCommandListener( new PrintCommandListener( this ) );

        try
        {
            if ( getRepository().getPort() != WagonConstants.UNKNOWN_PORT )
            {
                ftp.connect( host, getRepository().getPort() );
            }
            else
            {
                ftp.connect( host );
            }

            // After connection attempt, you should check the reply code to
            // verify
            // success.
            int reply = ftp.getReplyCode();

            if ( !FTPReply.isPositiveCompletion( reply ) )
            {
                fireSessionConnectionRefused();

                fireSessionDisconnecting();

                ftp.disconnect();

                fireSessionDisconnected();

                throw new AuthenticationException( "FTP server refused connection." );
            }
        }
        catch ( IOException e )
        {
            if ( ftp.isConnected() )
            {
                try
                {
                    fireSessionError( e );

                    fireSessionDisconnecting();

                    ftp.disconnect();

                    fireSessionDisconnected();
                }
                catch ( IOException f )
                {
                    // do nothing
                }
            }

            throw new AuthenticationException( "Could not connect to server.", e );
        }

        try
        {
            if ( !ftp.login( username.trim(), password.trim() ) )
            {
                fireSessionConnectionRefused();

                throw new AuthenticationException( "Cannot login to remote system" );
            }

            fireSessionDebug( "Remote system is " + ftp.getSystemName() );

            // Set to binary mode.
            ftp.setFileType( FTP.BINARY_FILE_TYPE );

            // Use passive mode as default because most of us are
            // behind firewalls these days.
            // TODO [BP]: make optional based on a flag
            ftp.enterLocalPassiveMode();
        }
        catch ( IOException e )
        {
            throw new ConnectionException( "Cannot login to remote system", e );
        }
    }

    protected void firePutCompleted( Resource resource, File file )
    {
        try
        {
            // TODO [BP]: verify the order is correct
            ftp.completePendingCommand();

            RepositoryPermissions permissions = repository.getPermissions();

            if ( permissions != null && permissions.getGroup() != null )
            {
                // ignore failures
                ftp.sendSiteCommand( "CHGRP " + permissions.getGroup() );
            }

            if ( permissions != null && permissions.getFileMode() != null )
            {
                // ignore failures
                ftp.sendSiteCommand( "CHMOD " + permissions.getFileMode() );
            }
        }
        catch ( IOException e )
        {
            // TODO: handle
            // michal I am not sure  what error means in that context
            // I think that we will be able to recover or simply we will fail later on
        }

        super.firePutCompleted( resource, file );
    }


    protected void fireGetCompleted( Resource resource, File localFile )
    {
        try
        {
            ftp.completePendingCommand();
        }
        catch ( IOException e )
        {
            // TODO: handle
            // michal I am not sure  what error means in that context
            // actually I am not even sure why we have to invoke that command
            // I think that we will be able to recover or simply we will fail later on
        }
        super.fireGetCompleted( resource, localFile );
    }

    public void closeConnection()
        throws ConnectionException
    {
        if ( ftp != null && ftp.isConnected() )
        {
            try
            {
                // This is a NPE rethink shutting down the streams
                ftp.disconnect();
            }
            catch ( IOException e )
            {
                throw new ConnectionException( "Failed to close connection to FTP repository", e );
            }
        }
    }


    public void fillOutputData( OutputData outputData )
        throws TransferFailedException
    {
        OutputStream os;

        Resource resource = outputData.getResource();

        RepositoryPermissions permissions = repository.getPermissions();

        try
        {
            if ( !ftp.changeWorkingDirectory( getRepository().getBasedir() ) )
            {
                throw new TransferFailedException(
                    "Required directory: '" + getRepository().getBasedir() + "' " + "is missing" );
            }

            String[] dirs = PathUtils.dirnames( resource.getName() );

            for ( int i = 0; i < dirs.length; i++ )
            {
                boolean dirChanged = ftp.changeWorkingDirectory( dirs[i] );

                if ( !dirChanged )
                {
                    // first, try to create it
                    boolean success = ftp.makeDirectory( dirs[i] );

                    if ( success )
                    {
                        if ( permissions != null && permissions.getGroup() != null )
                        {
                            // ignore failures
                            ftp.sendSiteCommand( "CHGRP " + permissions.getGroup() );
                        }

                        if ( permissions != null && permissions.getDirectoryMode() != null )
                        {
                            // ignore failures
                            ftp.sendSiteCommand( "CHMOD " + permissions.getDirectoryMode() );
                        }

                        dirChanged = ftp.changeWorkingDirectory( dirs[i] );
                    }
                }

                if ( !dirChanged )
                {
                    throw new TransferFailedException( "Unable to create directory " + dirs[i] );
                }
            }

            // we come back to orginal basedir so
            // FTP wagon is ready for next requests
            if ( !ftp.changeWorkingDirectory( getRepository().getBasedir() ) )
            {
                throw new TransferFailedException( "Unable to return to the base directory" );
            }

            os = ftp.storeFileStream( resource.getName() );

            if ( os == null )
            {
                String msg = "Cannot transfer resource:  '" + resource +
                    "' Output stream is null. FTP Server response: " + ftp.getReplyString();

                throw new TransferFailedException( msg );

            }

            fireTransferDebug( "resource = " + resource );

        }
        catch ( IOException e )
        {
            throw new TransferFailedException( "Error transferring over FTP", e );
        }

        outputData.setOutputStream( os );

    }

    // ----------------------------------------------------------------------
    //
    // ----------------------------------------------------------------------

    public void fillInputData( InputData inputData )
        throws TransferFailedException, ResourceDoesNotExistException
    {
        InputStream is;

        Resource resource = inputData.getResource();

        try
        {
            ftpChangeDirectory( resource );

            String filename = PathUtils.filename( resource.getName() );
            FTPFile[] ftpFiles = ftp.listFiles( filename );

            if ( ftpFiles == null || ftpFiles.length <= 0 )
            {
                throw new ResourceDoesNotExistException( "Could not find file: '" + resource + "'" );
            }

            long contentLength = ftpFiles[0].getSize();

            //@todo check how it works! javadoc of common login says:
            // Returns the file timestamp. This usually the last modification time.
            //
            long lastModified = ftpFiles[0].getTimestamp().getTimeInMillis();

            resource.setContentLength( contentLength );

            resource.setLastModified( lastModified );

            is = ftp.retrieveFileStream( filename );
        }
        catch ( IOException e )
        {
            throw new TransferFailedException( "Error transferring file via FTP", e );
        }

        inputData.setInputStream( is );
    }

    private void ftpChangeDirectory( Resource resource )
        throws IOException, TransferFailedException, ResourceDoesNotExistException
    {
        if ( !ftp.changeWorkingDirectory( getRepository().getBasedir() ) )
        {
            throw new TransferFailedException(
                "Required directory: '" + getRepository().getBasedir() + "' " + "is missing" );
        }

        String[] dirs = PathUtils.dirnames( resource.getName() );

        for ( int i = 0; i < dirs.length; i++ )
        {
            boolean dirChanged = ftp.changeWorkingDirectory( dirs[i] );

            if ( !dirChanged )
            {
                String msg = "Resource " + resource + " not found. Directory " + dirs[i] + " does not exist";

                throw new ResourceDoesNotExistException( msg );
            }
        }
    }


    public class PrintCommandListener
        implements ProtocolCommandListener
    {
        FtpWagon wagon;

        public PrintCommandListener( FtpWagon wagon )
        {
            this.wagon = wagon;
        }

        public void protocolCommandSent( ProtocolCommandEvent event )
        {
            wagon.fireSessionDebug( "Command sent: " + event.getMessage() );

        }

        public void protocolReplyReceived( ProtocolCommandEvent event )
        {
            wagon.fireSessionDebug( "Reply received: " + event.getMessage() );
        }
    }

    protected void fireSessionDebug( String msg )
    {
        super.fireSessionDebug( msg );
    }

    public List getFileList( String destinationDirectory )
        throws TransferFailedException, ResourceDoesNotExistException, AuthorizationException
    {
        Resource resource = new Resource(destinationDirectory);
        
        try 
        {
            ftpChangeDirectory( resource );
    
            String filename = PathUtils.filename( resource.getName() );
            FTPFile[] ftpFiles = ftp.listFiles( filename );
    
            if ( ftpFiles == null || ftpFiles.length <= 0 )
            {
                throw new ResourceDoesNotExistException( "Could not find file: '" + resource + "'" );
            }
            
            List ret = new ArrayList();
            for(int i=0; i<ftpFiles.length; i++)
            {
                ret.add(ftpFiles[i].getName());
            }
            
            return ret;
        } catch(IOException e)
        {
            throw new TransferFailedException( "Error transferring file via FTP", e );
        }
    }

    public boolean resourceExists( String resourceName )
        throws TransferFailedException, AuthorizationException
    {
        Resource resource = new Resource( resourceName );

        try
        {
            ftpChangeDirectory( resource );

            String filename = PathUtils.filename( resource.getName() );
            int status = ftp.stat( filename );

            return ( ( status == FTPReply.FILE_STATUS ) || ( status == FTPReply.FILE_STATUS_OK ) || ( status == FTPReply.SYSTEM_STATUS ) );
        }
        catch ( IOException e )
        {
            throw new TransferFailedException( "Error transferring file via FTP", e );
        }
        catch ( ResourceDoesNotExistException e )
        {
            return false;
        }
    }
    
    public boolean supportsDirectoryCopy()
    {
        return true;
    }

    public void putDirectory( File sourceDirectory, String destinationDirectory )
        throws TransferFailedException, ResourceDoesNotExistException, AuthorizationException
    {

        // Change to root.
        try
        {
            if ( !ftp.changeWorkingDirectory( getRepository().getBasedir() ) )
            {
            	//Basedir does not exist so we try to create it
            	if ( !ftp.makeDirectory( getRepository().getBasedir() ) )
            	{
            		throw new TransferFailedException( "Required directory: '" + getRepository().getBasedir() + "' "
                            + "is missing and could not be created" );
            	}
            }
        }
        catch ( IOException e )
        {
            throw new TransferFailedException( "Cannot change to root path " + getRepository().getBasedir() );
        }

        fireTransferDebug( "Recursively uploading directory " + sourceDirectory.getAbsolutePath() + " as "
                        + destinationDirectory );
        ftpRecursivePut( sourceDirectory, destinationDirectory );
    }

    private void ftpRecursivePut( File sourceFile, String fileName ) throws TransferFailedException
    {
        final RepositoryPermissions permissions = repository.getPermissions();

        fireTransferDebug( "processing = " + sourceFile.getAbsolutePath() + " as " + fileName );

        if ( sourceFile.isDirectory() )
        {
            if ( !fileName.equals( "." ) )
                try
                {
                    // change directory if it already exists.
                    if ( !ftp.changeWorkingDirectory( fileName ) )
                    {
                        // first, try to create it
                        if ( ftp.makeDirectory( fileName ) )
                        {
                            if ( permissions != null )
                            {
                                // Process permissions; note that if we get errors or exceptions here, they are ignored.
                                // This appears to be a conscious decision, based on other parts of this code.
                                String group = permissions.getGroup();
                                if ( group != null )
                                    try
                                    {
                                        ftp.sendSiteCommand( "CHGRP " + permissions.getGroup() );
                                    }
                                    catch ( IOException e )
                                    {
                                    }
                                String mode = permissions.getDirectoryMode();
                                if ( mode != null )
                                    try
                                    {
                                        ftp.sendSiteCommand( "CHMOD " + permissions.getDirectoryMode() );
                                    }
                                    catch ( IOException e )
                                    {
                                    }
                            }

                            if ( !ftp.changeWorkingDirectory( fileName ) )
                            {
                                throw new TransferFailedException( "Unable to change cwd on ftp server to " + fileName
                                                + " when processing " + sourceFile.getAbsolutePath() );
                            }
                        }
                        else
                        {
                            throw new TransferFailedException( "Unable to create directory " + fileName
                                            + " when processing " + sourceFile.getAbsolutePath() );
                        }
                    }
                }
                catch ( IOException e )
                {
                    throw new TransferFailedException( "IOException caught while processing path at "
                                    + sourceFile.getAbsolutePath(), e );
                }

            File[] files = sourceFile.listFiles();
            if ( files != null && files.length > 0 )
            {
                fireTransferDebug( "listing children of = " + sourceFile.getAbsolutePath() + " found " + files.length );

                // Directories first, then files. Let's go deep early.
                for ( int i = 0; i < files.length; i++ )
                {
                    if ( files[i].isDirectory() )
                        ftpRecursivePut( files[i], files[i].getName() );
                }
                for ( int i = 0; i < files.length; i++ )
                {
                    if ( !files[i].isDirectory() )
                        ftpRecursivePut( files[i], files[i].getName() );
                }
            }

            // Step back up a directory once we're done with the contents of this one.
            try
            {
                ftp.changeToParentDirectory();
            }
            catch ( IOException e )
            {
                throw new TransferFailedException(
                                                   "IOException caught while attempting to step up to parent directory after successfully processing "
                                                                   + sourceFile.getAbsolutePath(), e );
            }
        }
        else
        {
            // Oh how I hope and pray, in denial, but today I am still just a file.
            try
            {
                // It's a file. Upload it in the current directory.
            	FileInputStream fis = new FileInputStream( sourceFile );
                if ( ftp.storeFile( fileName, fis ) )
                {
                    if ( permissions != null )
                    {
                        // Process permissions; note that if we get errors or exceptions here, they are ignored.
                        // This appears to be a conscious decision, based on other parts of this code.
                        String group = permissions.getGroup();
                        if ( group != null )
                            try
                            {
                                ftp.sendSiteCommand( "CHGRP " + permissions.getGroup() );
                            }
                            catch ( IOException e )
                            {
                            }
                        String mode = permissions.getFileMode();
                        if ( mode != null )
                            try
                            {
                                ftp.sendSiteCommand( "CHMOD " + permissions.getDirectoryMode() );
                            }
                            catch ( IOException e )
                            {
                            }
                    }
                }
                else
                {
                    String msg =
                        "Cannot transfer resource:  '" + sourceFile.getAbsolutePath() + "' FTP Server response: "
                                        + ftp.getReplyString();
                    throw new TransferFailedException( msg );
                }
                fis.close();
            }
            catch ( IOException e )
            {
                throw new TransferFailedException( "IOException caught while attempting to upload "
                                + sourceFile.getAbsolutePath(), e );
            }

        }

        fireTransferDebug( "completed = " + sourceFile.getAbsolutePath() );
    }
}
