Feature: user can successfully log out

Scenario: user can successfully log out
  Given the user is logged in
  Then user clicks logout button
  And user observes login button with the right link