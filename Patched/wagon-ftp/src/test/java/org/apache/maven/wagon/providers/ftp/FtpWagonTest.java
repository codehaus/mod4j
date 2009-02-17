package org.apache.maven.wagon.providers.ftp;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
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

import org.apache.ftpserver.interfaces.FtpServerInterface;
import org.apache.maven.wagon.WagonTestCase;
import org.apache.maven.wagon.authentication.AuthenticationInfo;

/**
 * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a>
 * @version $Id: FtpWagonTest.java 162479 2005-04-19 03:58:25Z brett $
 */
public class FtpWagonTest
    extends WagonTestCase
{
    private FtpServerInterface server;

    protected String getProtocol()
    {
        return "ftp";
    }

    protected void setupWagonTestingFixtures()
        throws Exception
    {
        super.setUp();

        server = (FtpServerInterface) lookup( FtpServerInterface.ROLE );

    }

    protected void tearDownWagonTestingFixtures()
        throws Exception
    {
        release( server );
    }

    protected String getTestRepositoryUrl()
    {
        return "ftp://localhost:10023";
    }

    public AuthenticationInfo getAuthInfo()
    {
        AuthenticationInfo authInfo = new AuthenticationInfo();

        authInfo.setUserName( "admin" );

        authInfo.setPassword( "admin" );

        return authInfo;
    }
}
