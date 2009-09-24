create xdsl-admin eclipse project and import project into workspace:
mvn -Dwtpversion=1.5 eclipse:eclipse
import project into workspace:
	- import-> Existing Projects into workspace
	- import
	if you use the maven plugin:
		- go to "project->properties->Java Build Path->Libraries" and remove all libraries that start with "M2_REPO"
		- right click on admin project->Maven->Enable Dependency Management
OR
	- import-> Maven Projects
	- import
	if you want to fix the resources view (to view Flat Package Presentation (instead of hierarchical)):
	- go to "project->properties->Java Build Path->Source
	- edit resources/Excluded: change ** into **/*.java
	if you want to change the order of the src directories:
	- go to "project->properties->Java Build Path->Order and Export
	- change order

build project:
mvn -Dmaven.test.skip=true package

eclipse:
import project into workspace
	if you use the maven plugin:
	- go to "project->properties->Java Build Path->Libraries" and remove all libraries that start with "M2_REPO"
	- right click on admin project->Maven->Enable Dependency Management

create mysql database:
- create database test;
- CREATE USER test IDENTIFIED BY 'test';
- GRANT ALL ON test.* TO 'test'@'localhost' IDENTIFIED BY 'test';
- use eclipse jpox plugin:
	- Run Enhancer Tool
	- Run Schema Tool

populate database:
enhance jdo classes
run: com.kpn.bitstream.xdsl.admin.Init

run project as java application:
enhance jdo classes
run: com.kpn.bitstream.xdsl.admin.Start
(vm args (for runtime enhancement): -javaagent:F:\repository\jpox\jpox-enhancer\1.2.0\jpox-enhancer-1.2.0.jar)
url: http://localhost:8090/rbs/wicket

run project as java application (from the command line):
> mvn compile
> mvn jetty:run
url: http://localhost:8080/rbs-wicket

(Running Eclipse Open "Run --> External Tools --> External Tools... --> Program". Press "New launch configuration". On the "Main" tab, fill in the "Location:" as the full path to your "mvn" executable. For the "Working Directory:" select the workspace that matches your webapp. For "Arguments:" add jetty:run.)

run project in tomcat:
go to "project->properties->J2EE Module Dependencies" and select "Maven Dependencies" 
enhance jdo classes
start tomcat
url: http://localhost:8080/rbs-wicket
