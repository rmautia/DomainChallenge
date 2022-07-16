Feature: As a user
  I should be able to login to my store app
  So that I can shop.
  @ui
  Scenario: user logins in successfully
    Given we are on landing page
    When user clicks on sign_In option
    And user enters correct email and password
    Then user is logs in successfully
