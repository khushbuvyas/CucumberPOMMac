@Search-Cars
Feature: Acceptance testing to validate search cars working fine.
  In order to validate search car function working fine we will do acceptance testing

  @Search-Cars-Positive
  Scenario: Validation of search cars page
    Given I am on the home page "https://www.carsguide.com.au/" of carsguide website
    When I move to buy+sell menu
      | Menu     |
      | buy+sell |
      | reviews  |
      | news     |
      | advice   |
    And click on "Seach Cars" link
    And I select "BMW" from Any Make dropdwon
    And I select "1 Series" from Any Model dropdwon
    And I select "VIC - Melbourne" from Any Location dropdwon
    And I select "$3,000" from Price dropdwon
    And click on "Find My Next Car" button
    Then I should see the list of searched cars
    And the title of the page should be "Bmw 1 Series Under 3000 for Sale Melbourne VIC | carsguide" 
    
    
