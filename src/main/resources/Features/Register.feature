Feature: Register Functionality
  Scenario: verify that a new user can successfully create an account
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter a new name and email address
    And click on Signup button
    Then user navigate to Signup page
    When user enter a Password, First name, Last name, Address, State, City, Zipcode and Mobile Number
    And the user selects country "Canada"
    And click on Create Account button
    Then “ACCOUNT CREATED!” message appears



  Scenario:  verify that a user cannot create an account when user enter signup with existing email
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter a new name and existing email address
    And click on Signup button
    Then user sees Email Address already exist!


