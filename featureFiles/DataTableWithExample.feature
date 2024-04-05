@DataDriven
Feature: This is to test Facebook Login With Example
  Scenario Outline: This is a Facebook login scenario
    Given navigate to login page
    Given user enters the "<UserName>" and "<Password>"
    Then clicked login button

    Examples:
      | UserName                  | Password  |
      | manojkumardev27@gmail.com | Godhand27 |
      | manojkumardev27@gmail.com | Godhand   |
