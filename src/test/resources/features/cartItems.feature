Feature: As a user I should be able to add 2 items to cart

  @ui
  Scenario: user successfully add two items to cart
    Given user is successfully logged to store
    And user selects two items to cart
    Then There are two items in your cart message is displayed

