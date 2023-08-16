Feature: Check header automation exercise site
  Scenario: logged out user can see all header elements
    Given the user is on home page
    Then user observes site logo with the right link
    And user observes 8 navigation links
    And user observes home button with the right link
    And user observes products button with the right link
    And user observes cart button with the right link
    And user observes login button with the right link
    And user observes test cases button with the right link
    And user observes api testing button with the right link
    And user observes video tutorials button with the right link
    And user observes contact us button with the right link

  Scenario: logged in user can see all header elements
    Given the user is logged in
    Then user observes site logo with the right link
    And user observes 10 navigation links
    And user observes home button with the right link
    And user observes products button with the right link
    And user observes cart button with the right link
    And user observes logout button with the right link
    And user observes delete account button with the right link
    And user observes test cases button with the right link
    And user observes api testing button with the right link
    And user observes video tutorials button with the right link
    And user observes contact us button with the right link
    And user observes user notification


