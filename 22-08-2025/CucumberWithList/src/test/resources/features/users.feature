Feature: User validation with list
  Scenario: Validate multiple usernames
    Given the following usernames:
      | Martin |
      | Scott   |
      |  Sunil |
    When I process the usernames
    Then I should see 3 usernames processed
