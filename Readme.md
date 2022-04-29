# **Environment:**
Java version: 11

Maven version: 4.*

Selenium : 4.1.3

Docker

# **Dependencies**
Cucumber

Junit

WebDriverManager

##**Content **

 Testing framework based on POM design pattern.

     Classes: Pages Class, Runner Class, Step_definitions Class, Utils Class

  - Pages Class includes all the web element and its methods.
  - Runner Class includes features and glue
  - Step Definition Class includes every step of feature file scenarios.
  - Utils class includes driver implementation.

 ###How To Run Tests
-First run the OWASP Juice Shop on your local 

 How to run docket: -docker run --publish 3000:3000 bkimminich/juice-shop

-Clone repository

-Run tests from runner class

