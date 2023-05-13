@All
Feature: Forgot password
  I want to use this template for forgot password feature file

 @smoke @regression
  Scenario: forgot the valid user id
    Given User naviagte  to the forgot password page
    When User enter the  "Email" id
    And click on continue button
    Then succes warning message  should Displayed

  @smoke
  Scenario Outline: forgot the invalid User id
    Given User naviagte  to the forgot password page
  #  When User enter the invalid  <Email>id
    And click on continue button
    Then Warning msg should Displayed
  # Examples: 
    #  | Email |
   #   | sandip@gmail.com |
    #  | ram25@gmail.com |
    #  | naveen@yahoo.com |
