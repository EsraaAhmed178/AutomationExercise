Feature: All Products and Product Details Functionality

  Scenario: Verify All Products and Product Details Appear
    Given user in home page
    When user click on Products
    Then the products list should be visible
    And the user opens 2 product from the list
    Then the correct product details should be displayed



  Scenario: Verify no Products appear when user enter invalid data in search text
    Given user in home page
    When user click on Products
    Then user enter invalid search text data
    And click on search icon
    Then the products page displayed empty

