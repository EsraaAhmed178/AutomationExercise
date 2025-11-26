Feature: Add Products to Cart And Complete Checkout Functionality

  Scenario: Verify That User Can Add Products to Cart And Complete Checkout
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



    When user click on View Cart
    Then user Proceed to Checkout
    And user Validate address
    And user click on Place Order
    And user Enter payment details
    And user click on pay button
    Then user sees “Your order has been placed successfully!”



  #Scenario: Verify That User Can Complete Checkout
   # Given user in product page
    #When user click on View Cart
    #Then user Proceed to Checkout
    #And user Validate address
    #And user click on Place Order
    #And user Enter payment details
    #Then user sees “Your order has been placed successfully!”



  Scenario: Verify That User Cannot Complete Checkout with empty cart
    Given user in home page
    When user click on signup login
    Then user navigate to Signup Login page
    When user enter valid registered email and password
    And click on Login button
    Then User sees “Logged in as <username>"
    When user in home page
    Then user click on View Cart
    And user sees Cart is empty!





  Scenario: Verify That User Cannot Complete Checkout with invalid  payment info
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


    When user in product page
    When user click on View Cart
    Then user Proceed to Checkout
    And user Validate address
    And user click on Place Order
    And user Enter invalid payment details
    And user click on pay button
    Then user still in payment page





  Scenario: Verify That User Cannot Complete Checkout without login
    Given user in home page
    When user click on Products
    Then user Hover over any product
    And Click Add to Cart
    Then Product added message displayed


    When user in product page
    When user click on View Cart
    When user Proceed to Checkout
    And user sees login Div













