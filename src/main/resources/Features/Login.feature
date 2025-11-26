Feature: Login Functionality

  Scenario: Verify That Registered User Can Log In Successfully
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter valid registered email and password
    And click on Login button
    Then  User sees “Logged in as <username>"


  Scenario Outline: verify that login is fail when user enter invalid email or password
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter invalid registered "<email>" and "<password>"
    And click on Login button
    Then  User sees Your email or password is incorrect!
    Examples:
      | email | password |
      |      aaaaaaaaa@gmail.com           |    123 |
      |         eeeaaaaaaaaa@gmail.com         |             567                 |
      |    aaaaaa@gmail.com|         567                     |


