@DataDriven
Feature: This is to test Facebook Login With Header
  Scenario: Facebook login example
    Given the user navigates to facebook.com
    Given user enters the credentials
      | UserName                  | Password  |
      | manojkumardev27@gmail.com | Godhand27 |
    Then user logged into the page