Feature: Juice registration page

  Scenario: Positive scenario for registration page
    Given a running juiceshop application
    When the user goes to the login page
    And the user clicks “Not yet a customer?”
    Then the registration page appears