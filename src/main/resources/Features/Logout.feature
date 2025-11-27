Feature: Logout Functionality

  Scenario: Verify That User Can Logout After Login
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter valid registered email and password
    And click on Login button
    Then  User sees “Logged in as <username>"
    When user click on logout
    Then user Redirec t to Login Signup page