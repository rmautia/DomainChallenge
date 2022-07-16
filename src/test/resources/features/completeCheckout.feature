Feature: As a user I should be able to complete checkout process with any payment option


  @ui
  Scenario: user successfully complete checkout process
    Given user is logged to store
    And user adds two items to cart
    When user selects proceeds to checkout
    And user checks payment method
    Then user should successfully place order