Feature: Login Functionality

  Scenario: Login with multiple users using data table
    Given the following users attempt to login:
      | username | password |
      | user1    | pass1   |
      | user2    | pass2   |
      | user3    | PAssword |
      | Sunil    | sunil    |
      | Yogi     |  yogi    |