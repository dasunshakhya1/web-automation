Feature: Verify login functionality

  Scenario: User login with valid credentials
    Given User navigates to the application
    When User provides valid credentials
    Then User should be able to login