Feature: Contact Us Form Functionality

  Scenario: verify that users can submit a message
    Given user in home page
    When user click on Contact Us
    Then user enter name,email, subject and message
    And click on Submit button
    And accept alert
    Then user sees Success message





  Scenario: verify that users cannot submit a message when user does not enter email
    Given user in home page
    When user click on Contact Us
    And click on Submit button
    Then submit does not occur




  Scenario: verify that users cannot submit a message when user does not accept alert
    Given user in home page
    When user click on Contact Us
    Then user enter name,email, subject and message
    And click on Submit button
    And cancel alert
    Then submit does not occur










