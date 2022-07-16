Feature: As a user
  I should be able to add 2 items to cart
  so that I can purchase them

  @ui
  Scenario: user successfully add two items to cart
    Given user is successfully logged to store
    And user selects item one
    Then There are two items in your cart message is displayed

    When user selects proceed to logout
    And user checks payment method
    Then user should successfully place order