AutomationExercise Website
This project automates end-to-end testing for the AutomationExercise website.
The objective is to validate critical functionalities such as:

✅ User Registration
✅ Login
✅ Product Browsing
✅ Cart Operations
✅ Checkout Scenarios
✅ Contact Form Submission
✅ Test Cases Page
…and more.
The framework follows modern automation standards using Java, Selenium WebDriver, TestNG, Cucumber (BDD) and Page Object Model (POM).



Tech Stack
| Technology                    | Description                            |
| ----------------------------- | -------------------------------------- |
| **Java**                      | Programming language for automation    |
| **Selenium WebDriver**        | Browser automation                     |
| **Cucumber (BDD)**            | Behavior-driven testing with Gherkin   |
| **TestNG**                    | Test execution, assertions & reporting |
| **Page Object Model (POM)**   | Maintainable project architecture      |



AutomationExercise/target/test-classes/cucumber-testing.json
Project Structure
AutomationExercise/
 ├── src/main/resources/
 │    ├── Features/                
 ├── src/test/java/
 │    ├── Hooks/      
 │    ├── Pages/              
 │    └── StepDefinitions/            
 │    └── TestRunner/  
 ├── target/Reposts/
 │    ├── cucumber-testing-report.html 
 ├── target/test-classes/
 │    ├── cucumber-testing.json
 ├── pom.xml                   
 └── README.md



How to Run the Tests:
Using Cucumber Runner: src/test/java/TestRunner/Runner



Page Object Model (POM)
Each webpage has its own dedicated POM class inside: src/test/java/Pages/

This improves:
✔ Reusability
✔ Maintainability
✔ Readability

Each page contains:
✔ WebElements
✔ Page actions
✔ Page behaviours



Sample Feature (Example):
Feature: Test Cases Page Functionality
  Scenario: Verify Test Cases Load Successfully
    Given user in home page
    When user click on Click Test Cases
    Then Test cases load successfully




    
