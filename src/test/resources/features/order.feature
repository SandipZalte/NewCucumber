@All
Feature: Amazon Order page
  In oder to check my order details as registeered user 
  i want to specify the feature of order details page

  Background: 
    Given a register user exists
    And User naviagte to login page
    When User enter the  username
    And User enter the password
    And click on login button
    Then user naviagte to the order page

  @tag1
  Scenario: check the previous order details
    When User click on previous order details
    Then User should check the previous order link

  @tag2
  Scenario: check the previous open order details
    When click on open order link
    Then User should check the open order link

  @tag3
  Scenario: check the  canceled order details
    When click on canceled order link
    Then User should check the cancel order details
