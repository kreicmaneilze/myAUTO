
Feature: Validate Different Options

  @appium
  Scenario: Sign in wave
    Given I open the application
    When I tap on Entreprise
    Then I select button Next


    Scenario: Entering details
      Given I validate username textfield
      When I tap on username field
      Then I type username

  Scenario: Entering details
    Given I validate password textfield
    When I tap on password field
    Then I type password

  Scenario: Entering server address
    Given I scroll down to validate server textfield
    When I tap on server field
    Then I type server address
    And I scroll down to validate Sign in button
    And I select Sign In