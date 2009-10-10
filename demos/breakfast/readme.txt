To see the Rosa's Breakfast web application in action follow the steps below.

 1- Setup your local development environment by following the Getting
    Started instructions in the Mod4j User Guide (http://mod4j.org).
    
 2- Enable Java EE Module Dependencies in breakfast-web:
    - Navigate to breakfast-web > Properties > Java EE Module Dependencies
    - Enable the following Modules:
      breakfast-data, breakfast-domain, breakfast-business and breakfast-service
    - Enable the following Libraries:
      Maven Classpath Container and Persisted Container [org.devzuz...]
 
 3- Download and install Sun GlassFish application server version 2.1 (See:
    http://www.sun.com/software/products/appsrvr)
 
 4- In Eclipse Add GlassFish as a Server: 
    - Open the Server View: Navigate to Window > Show View > Servers
    - Create a new Server: Right mouse click > New and choose GlassFish
      v2.1 Java EE 5
    - Complete the wizard by filing in the appropriate properties
      Application server Directory: location of GlassFish installation
 
 5- Set GlassFish preferences in Eclipse: Navigate to Window > Preferences >
    GlassFish Preferences and enable the option : “Start the JavaDB database 
    process when starting GlasFish Server”
 
 6 In Eclipse server View: Start GlassFish 
 
 7- In Eclipse server View: Open the GlassFish admin console add a Derby Connection Pool:
    Navigate to Resources > Connection Pools and create a new Connection Pool with the
    following properties:
    Name: DerbyPool
    DataSource ClassName: org.apache.derby.jdbc.ClientDataSource
    Resource Type: javax.sql.DataSource
 
 8- In the GlassFish admin conslole add a JDBC Resource:
    Navigate to Resources > JDBC > JDBC Resources and create a new
    JDBC Resource with the following properties:
    JNDI Name: jdbc/breakfastDatasource
    PoolName: DerbyPool
    Description: Breakfast jdbc datasource
 
 9- Deploy the breakfast-web module to the GlassFish server
    Select web project in Eclipse > right mouse > Run On Server > select
    GlassFish Server (default)
 
 10- To see the web application running:
     Open http://localhost:8080/breakfast-web/breakfast in a browser
