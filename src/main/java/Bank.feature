Feature: Bank Login Functionality

  Scenario: Successful bank login
    Given user is on bank login page
    When user enters bank user name and password
    And clicks on bank login button
    Then user should be navigated to bank home page
