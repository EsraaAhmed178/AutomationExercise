Feature: Login Functionality
  Scenario: Verify That Registered User Can Log In Successfully
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter valid registered email and password
    And click on Login button
    Then  User sees “Logged in as <username>"
