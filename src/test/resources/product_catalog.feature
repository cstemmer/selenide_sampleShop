Feature: product catalog page

  Scenario: check sidebar categories and brands are displayed correctly for logged out user
    When user is on product catalog page
    Then user can observe categories heading
    And three categories are displayed
    And category Women heading is displayed
    And category Men heading is displayed
    And category Kids heading is displayed
    And Women subcategories are not displayed
    And Men subcategories are not displayed
    And Kids subcategories are not displayed
    Then user clicks category Women expand icon
    And category Women has three subcategories with correct links
    Then user clicks category Men expand icon
    And Women subcategories are not displayed
    And category Men has two subcategories with correct links
    Then user clicks category Kids expand icon
    And Men subcategories are not displayed
    And category Kids has two subcategories with correct links
