@TaggedHooks
Feature: Test Tagged Hooks
  @First
  Scenario: This is the first scenario
      Given this is the first step
      When this is the second step
      Then this is the third step
  @Second
  Scenario: This is the second scenario
    Given this is the first step
    When this is the second step
    Then this is the third step
  @Third
  Scenario: This is the third scenario
    Given this is the first step
    When this is the second step
    Then this is the third step