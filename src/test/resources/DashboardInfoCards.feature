@Smoke1
Feature: Dashboard page testing for NHS patient portal

  Background:

    Given User navigates to the NHS website
    When User successfully logged in username 'admin' and correct password 'admin'
    Then User validates the page title is 'NHS patients'

  Scenario: Validate the 3 tabs are displayed on the Dashboard page
    When User can see the tabs displayed on the Dashboard
    Then User can see hospital '2' '43' '15' rooms capacity numbers
    And User can see the Patients with rooms table displayed on the home page