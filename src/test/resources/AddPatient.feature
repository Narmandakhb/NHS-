@Smoke2
Feature: Validating the NHS Add Patient portal


  Background:

    Given User navigates to the NHS website
    When User successfully logged in username 'admin' and correct password 'admin'
    Then User validates the page title is 'NHS patients'



  Scenario: Validate 'add Patient' functionality on the dashboard;
    When User click clicks on the Add patient side bar button
    And User able to add new patient details and clicks Add patient button on the add patient page
    Then User can see the patient in Patients waiting table