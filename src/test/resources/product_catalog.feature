Feature: product catalog page

  Scenario: check sidebar categories are displayed correctly for logged out user
    When user is on product catalog page
    Then user can observe categories heading
    And three categories are displayed
    And category Women heading is displayed
    And category Men heading is displayed
    And category Kids heading is displayed
    And Women subcategories are not displayed
    And Men subcategories are not displayed
    And Kids subcategories are not displayed
    Then user clicks category Women heading
    And category Women has three subcategories with correct links
    Then user clicks category Women heading
    And Women subcategories are not displayed
    Then user clicks category Men heading
    And category Men has two subcategories with correct links
    Then user clicks category Men heading
    And Men subcategories are not displayed
    Then user clicks category Kids heading
    And category Kids has two subcategories with correct links
    Then user clicks category Kids heading
    And Kids subcategories are not displayed

  Scenario: check sidebar brands are displayed correctly for logged out user
    When user is on product catalog page
    Then user can observe brands heading
    And user can observe brand Polo with number of articles
    And user can observe brand H&M with number of articles
    And user can observe brand Madame with number of articles
    And user can observe brand Mast&Harbour with number of articles
    And user can observe brand Babyhug with number of articles
    And user can observe brand Allen Solly with number of articles
    And user can observe brand Kookie kids with number of articles
    And user can observe brand Biba with number of articles



