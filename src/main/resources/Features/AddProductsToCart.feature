Feature: Add Products to Cart Functionality

  Scenario: Verify That User Can Add Products to Cart
    Given user in home page
    When user click on Products
    Then user Hover over any product
    And Click Add to Cart
    Then Product added message displayed

