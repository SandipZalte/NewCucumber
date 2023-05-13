Feature: 
  Enter the Regsitartion Form

  @tag
  Scenario: New user registrtion
    new user enter the all mendatory information

    Given user open the registration page
    When user enter the all below details
      | Sandip | Zalte | Sandip@xyz.com |        1245 |     98448 | Nashik    |
      | Rahul  | Lathe | rhl@gmail.com  |       45454 | 984878878 | Mumbai    |
      | Naveen | Lab   | lab@new.com    | naven@12345 |    888888 | Banaglore |
    Then Regstration successful msg Show

  Scenario: New user registrtion with different data from Column
      new user enter the all mendatory information

    Given user open the registration page
    When user enter the all below details column
      | Name    | LastName | Userid          | Password    | MobileNumber | City      |
      | Sandipi | Zalte    | Sandipi@xyz.com |       12465 | 94!8448      | Nashik    |
      | Rahul i | Lathe    | rhli@gmail.com  |      454564 |   9848578878 | Mumbai    |
      | Naveen  | i Lab    | labi@new.com    | naven@12345 |       888888 | Banaglore |
    Then Regstration successful msg Show
