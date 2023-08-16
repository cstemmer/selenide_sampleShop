Feature: Login to automation exercise site
  Scenario: user can successfully login
    Given the user is on login page
    When user inputs valid email
    And user inputs valid password
    And user clicks submit button
    Then user is logged in

  Scenario: user cannot login with invalid password
    Given the user is on login page
    When user inputs valid email
    And user inputs invalid password
    And user clicks submit button
    Then user is not logged in
    And user sees error message

  Scenario: user cannot login with invalid email
    Given the user is on login page
    When user inputs invalid email
    And user inputs valid password
    And user clicks submit button
    Then user is not logged in
    And user sees error message