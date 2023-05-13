@All
Feature: login

  Scenario: Check the login with valid creditals
    Given User navigate the loginpage
    When user  enter "Sandy@gmail.com" and 12354
    Then naviagte to homepage

  Scenario: Check the login with invalid creditals
    Given User navigate the loginpage
    When user  enter "1234@gmail.com" and 55555
    Then warning msg should be display
