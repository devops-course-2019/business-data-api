This project is used as a basis for DevOps projects.

## Work log

2019-04-15 Initial project created with a table showing the available products.

2019-04-20 Information on the database connection for the business-data-api.  
The information for the database connection is read by the application from the src/main/resources/application.properties file. For security reasons the actual address username and password is not included in the repository but rather variables enclosed by @ signs (see file).  
You can choose yourself how to handle this replacement but on option is to use maven filtering (study the topic yourself).
Inspecting the pom.xml you can see that a resources section is included which supports the maven goal resources.
  
Example of command line usage: mvn package resources:resources -Ddburl="actual database url" -Ddbuser="actual username" -Ddbpassword="actual password"

2019-04-22 Added endpoint for deleting of orders based on orderID at /deleteOrder/{orderID}.

2019-05-01 Changes to allow for test of CI/CD setup
First test
Second test
Third test
Forth test

2019-05-29 Changes to allow for test of CI/CD setup
Test 1
Test 2

2020-01-08 Changes to test CI/CD
Test 1
Test 2

2020-01-24 Changes to test CI/CD
Test 1
Test 2
Test 3
Test 4
