@Regression
Feature: Testing the NHS Application Login Functionality


  Background: Navigation for the website


  Scenario: Happy Path for login Functionality
    Given User navigates to the NHS website
    When User provides correct username 'admin' and correct password 'admin'
    Then User validates the page title is 'NHS patients'


  Scenario Outline: Negative path Login functionality with invalid credentials
    Given User navigates to the NHS website
    When  User enters  '<username>' and  '<password>'
    Then User validates the page title is '<pageTitle>'

    Examples:
      | username    | password    | pageTitle |
      | invalidUser | admin       | LoginPage |
      | admin       | invalidPass | LoginPage |
      | invalidUser | invalidPass | LoginPage |
