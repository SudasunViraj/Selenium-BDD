Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given user is on the login page
    When user enters username "standard_user"
    And user enters password "secret_sauce"
    And user clicks on login button
    Then user should be redirected to dashboard
