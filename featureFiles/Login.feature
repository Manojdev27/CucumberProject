Feature: This is to test Facebook Login
  Scenario: Facebook login
    Given user is entering facebook.com
    When user is typing the username
    And user is typing the password
    Then the login button is clicked