 Feature: Automate Google Search
 
  Scenario: Automate Google Site
  Given I open the ie browser
    When I go to the Google site
    And I see site Google page tile
    And I search for selenium automation testing jobs
    Then I click Google Search and choose 