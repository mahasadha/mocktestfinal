
Feature: User Login

  Scenario Outline: user logs in with valid credentials
    Given the user is on the login page
    When they enter "<username>" and "<password>"
    And they click the login button
    Then they should be redirected to the dashboard

    Examples: 
      | username              | password            | status  |
      | "standard_user"       |     "secret_sause"  | success |
      | "name2"               |     "pass2"         | Fail    |
