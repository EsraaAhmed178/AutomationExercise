Feature: Add Products to Cart And Complete Checkout Functionality

  Background: Verify That User Can Add Products to Cart
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter valid registered email and password
    And click on Login button
    Then  User sees “Logged in as <username>"
    When user click on Products
    Then user Hover over any product
    And Click Add to Cart
    Then Product added message displayed



  Scenario: Verify That User Can Complete Checkout
    Given user in product page
    When user click on View Cart
    Then user Proceed to Checkout
    And user Validate address
    And user click on Place Order
    And user Enter payment details
    Then user sees “Your order has been placed successfully!”

