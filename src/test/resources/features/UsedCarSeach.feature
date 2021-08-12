@Used-Search-Cars
Feature: Acceptance testing to validate used search cars working fine.
  In order to validate used search car function working fine we will do acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validation of used search cars page
    Given I am on the home page "https://www.carsguide.com.au/" of carsguide website
    When I move to buy+sell menu
      | Menu     |
      | buy+sell |
      | reviews  |
      | news     |
      | advice   |
    And click on "Used" link to validate Used car search 
    And I select "Audi" from Any Make dropdwon
    And I select "A3" from Any Model dropdwon
    And I select "ACT - All" from Any Location dropdwon
    And I select "$2,500" from Price dropdwon
    And click on "Find My Next Car" button
    Then I should see the list of searched cars
    And the title of the page should be "Used Audi A3 Under 2500 for Sale ACT | carsguide"
