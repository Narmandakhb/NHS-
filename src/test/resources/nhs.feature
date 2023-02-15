Feature: Testing the NHS Application Login Functionality


  Background: Navigation for the website
    Given User navigates to the NHS website

  Scenario: Happy Path for login Functionality
    When User provides correct username 'admin' and correct password 'admin'
    Then User validates 'expectedUrl'