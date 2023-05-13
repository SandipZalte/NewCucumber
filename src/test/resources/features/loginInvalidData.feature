Feature: invalid Login Data .feature

  #Concept of Data driven testing
  # This Acts As Table
  #Scenario Outline
  #Example : Keyword must be used
  @tag1
  Scenario: Login fails possible combinattion

  Scenario Outline: Login fails possible combinattion
    Given User open the appliaction interface
    When User click on loginbutton
    Then user navigate to the login page
    When User enter the "<UserName>" in Userid field
    And User enter the th "<Password> "in Password field
    And User enter  the "<Pin>" in pin field
    And Click on Login Button 
    Then Warning Msg should be Displyed As Your UserId and Passowrd is Wrong

    Examples: 
      | UserName | Password  | Pin     |
      | name1    |    123456 |     123 |
      | name2    |    789547 | @123    |
      | name3    |    515454 | $147    |
      | name4    | 784888467 | $@#A123 |
      | name5    | 784888467 | zxzcc   |
