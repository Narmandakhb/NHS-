@Smoke
Feature: Validating the NHS DashboardPage's rooms and patient numbers

  Scenario: Validate the NHS Dashboard page successfully logged in

    Given User navigates to the NHS website
    When User successfully logged in username 'admin' and correct password 'admin'
    Then User should see '3', '4', '0' cards on the Dashboard
    And User validates the numerical information about room '3', '4', '0'
