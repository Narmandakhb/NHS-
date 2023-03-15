@Smoke3

Feature: Validate System Settings page

  Background:

    Given User navigates to the NHS website
    When User successfully logged in username 'admin' and correct password 'admin'
    Then User validates the page title is 'NHS patients'

  Scenario: Verify add new disease to system
    When User clicks on the 'System settings' side bar
    And User adds new disease name 'Psoriasis' score '3' to system and clicks add button
    Then User can see the disease in and Delete diseases 'Psoriasis' from the system table
