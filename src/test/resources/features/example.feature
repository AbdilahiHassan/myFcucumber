Feature: calculotor
  Scenario: Add two numbers
    Given I have first number 10
    Given I have second number 20
    When I add the two numbers
    Then I get the result 30

  Scenario: Add two numbers
    Given I have first number 50
    Given I have second number 20
    When I sub the two numbers
    Then I get the result 30

  Scenario: Add two numbers
    Given I have first number 5
    Given I have second number 20
    When I Mult  the two numbers
    Then I get the result 100

  Scenario: Add two numbers
    Given I have first number 30
    Given I have second number 5
    When I Divide  the two numbers
    Then I get the result 6