@All
Feature: Amazon search
  search the valid product

  @smoke @regression @qaready @US-900
  Scenario: search the product
    Given I have search field in amazon page
    When I search the product with Name "LenovoG50" and Price 50000
    Then Product  with Name "LenovoG50" should be Displayed

     Scenario: search the IPhone