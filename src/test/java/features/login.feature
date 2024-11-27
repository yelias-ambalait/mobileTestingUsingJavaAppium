Feature: Verifying the earning soft login functionality

  @MobileTest
  Scenario: Verify that the login functionality without credentials
    Given Home page is displayed
    Then Check that the login form is displayed
    When Click on the login button
    Then Check that the "This field cannot be left empty!" message is displayed
