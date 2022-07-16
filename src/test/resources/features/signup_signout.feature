Feature: As a user I should be able to SignUp to my store account and sign out

#  Background:
#    Given we are at my store landing page

  @ui
  Scenario: user initiates Signup and signOut successfully
    Given we are at my store landing page
    When user clicks on signIn option
    And enters e-mail address
    And clicks create account button
    Then user user should be directed to enter metadata page
    When user fills all credentials
    And clicks register button
    Then user is redirected to homePage
    And user can successfully logout when done shopping





