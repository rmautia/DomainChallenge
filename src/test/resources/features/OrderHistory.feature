Feature: As a user I should be able to verify order history
  @ui
  Scenario: user can successfully verify order history
    Given user is successfully logged in to store
    When user clicks order history and details option
    Then user can view their order history