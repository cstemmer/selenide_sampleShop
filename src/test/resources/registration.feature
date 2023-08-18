Feature: Registration

  Scenario: Register a new user
    When the user is on login page
    And signup heading is visible
    And user inputs new unique name
    And user inputs new unique email
    And user clicks signup button
    Then user is redirected to signup url
    And page heading is visible
    And title heading is visible with two gender choices
    And user selects female gender
    And name input field contains previously inserted name
    And email input field contains previously inserted email
    And user can input password
    And user can input date of birth
    And user can check both checkboxes
    And address header is visible
    And user can input address details
    Then user clicks create account button
    And user is redirected to success screen
    And the user is on home page
    Then user observes logout button with the right link
    And user sees welcome message with their name



