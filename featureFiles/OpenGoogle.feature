Feature: This is to test google search
  Scenario: Google Search Scenario
    Given user is entering google.co.in
    When user is typing the search term "Harry Potter"
    And enters the return key
    Then the user should see the search results
    Then the driver is closed
