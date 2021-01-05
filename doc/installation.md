# Pre-requisites
- <a href="https://www.java.com/en/download/" target="_blank">Java</a>
- <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a>
# Setting up selenium-cucumber-java
- Install Java and set path.
- Install Maven and set path.
- Change the path of the webdriver in RunCucumberTest.java
- Webdriver should match chromium version 
# Running features
- Goto project directory.
- Use "mvn test" command to run features.
- Use "mvn install" if the "generated-report" won't appear
- Use "mvn clean" to delete the generated files (screenshots included) 
- Now Write your own tests in feature file using <a href="https://github.com/firashajbi/cucumber_selenium/blob/master/doc/predsteps.md">Predefined Steps</a> .
