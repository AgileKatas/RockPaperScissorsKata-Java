Feature: Rock Beats Scissors
  As a player
  I want rock to beat scissors
  So that I can play with rules I'm familiar with

  Scenario Outline: Rock beats scissors
    Given I have chosen <myMove>
    When the opponent chooses <theirMove>
    Then I should <result>

    Examples:
      | myMove   | theirMove | result |
      | rock     | scissors  | win    |
      | scissors | rock      | lose   |
