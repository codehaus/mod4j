To see the Rosa's Breakfast web application in action follow the steps below.

 1- Setup your local development environment by following the Getting
    Started instructions in the Mod4j User Guide (http://mod4j.org).
 
 2- Download and install Sun GlassFish applicationserver version 2.1 (See:
    https://glassfish.dev.java.net/downloads/v2.1-b60e.html)
 
 3- In Eclipse Add GlassFish as a Server: 
    - Open the Server View: Navigate to Window > Show View > Servers
    - Create a new Server: Right mouse click > New and choose GlassFish
      v2.1 Java EE 5
    - Complete the wizard by filing in the appropriate properties
      Application server Directory: location of GlassFish installation
 
 4- Set GlassFish preferences in Eclipse: Navigate to Window > Preferences >
    GlassFish Preferences and enable the option : “Start the JavaDB database 
    process when starting GlasFish Server”
 
 5- In Eclipse server view: Start GlassFish 
 
 6- In Eclipse server view: Open the GlassFish admin console add a Derby Connection Pool:
    Navigate to Resources > Connection Pools and create a new Connection Pool with the
    following properties:
    Name: DerbyPool
    DataSource ClassName: org.apache.derby.jdbc.ClientDataSource
    Resource Type: javax.sql.DataSource
 
 7- In the GlassFish admin conslole add a JDBC Resource:
    Navigate to Resources > JDBC > JDBC Resources and create a new
    JDBC Resource with the following properties:
    JNDI Name: jdbc/breakfastDatasource
    PoolName: DerbyPool
    Description: Breakfast jdbc datasource
 
 8- Deploy the breakfast-web module to the GlassFish server
    Select web project in Eclipse > right mouse > Run On Server > select
    GlassFish Server (default)
 
 9- To see the web application running:
    Open http://localhost:8080/breakfast-web/breakfast in a browser
