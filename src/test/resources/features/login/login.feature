Feature: Verify login functionality

  Scenario: User login with valid credentials
    Given User navigates to the application
    When User provides credentials <loginId>
    Then User should be able to login

        Examples:
          | loginId|
          |standard_user|
          |locked_out_user|
          |problem_user|
          |performance_glitch_user|