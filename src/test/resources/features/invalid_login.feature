@smoke @negative
Feature: Invalid login

  Scenario Outline: Login fails with invalid credentials
    Given user is on the login page
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks on login button
    Then error message should be displayed

    Examples:
      | username       | password      |
      | standard_user  | wrong_pass    |
      | wrong_user     | secret_sauce  |
      |                | secret_sauce  |
      | standard_user  |               |