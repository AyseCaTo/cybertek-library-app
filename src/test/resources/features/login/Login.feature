Feature: Login Functionality
  User should be able to login

  Background:
    Given User is on the login page

  @loginLibrarian
  Scenario: Login as a Librarian
      When User login as a librarian
      Then Dashboard should be displayed

  @loginStudent
  Scenario: Login as a Student
      When User login as a Student
      Then Dashboard should be displayed





