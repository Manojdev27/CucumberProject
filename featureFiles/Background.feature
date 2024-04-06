@BackgroundExample
  Feature: To explain the usage of background
    Background: Student Completed School Education
      Given The Student finished high School
      Given The Student finished higher Secondary
    Scenario: To Study Engineering
      Given the student applied for Engineering Course
      When the student cleared the entrance exam
      Then the student is eligible for joining the College
    Scenario: To Study Foreign Studies
      Given the student applied for any foreign university
      When the student cleared the entrance exam
      Then the student is eligible for joining the university