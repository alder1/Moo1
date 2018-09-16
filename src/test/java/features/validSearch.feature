Feature:As a user of Moo when I am on the website and I carryout a search for valid product I want to be able to view the matching products

  Scenario:
    Given I launch the moo website
    When I enter a valid item into the search field and click enter
    Then I should be able to view all products matching my search item
    And I should be able to confirm the total results returned for my search item