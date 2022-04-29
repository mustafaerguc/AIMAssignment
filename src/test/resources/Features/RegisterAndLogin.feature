Feature: Register and Login

  Scenario: Positive scenario for register and log in
    Given a running juiceshop application
    When the user goes to the login page
    And the user clicks “Not yet a customer?”
    And the user enters a username, password, security question, and answer
    And the user clicks “Register”
    Then the user can log in with the provided username and password

