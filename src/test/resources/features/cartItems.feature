Feature: As a user
  I should be able to add 2 items to cart
  so that I can purchase them

  @bd

  Scenario: user successfully add two items to cart
    Given user is successfully logged to store
    And user selects item one
    And item two
    Then There are two items in your cart message is displayed