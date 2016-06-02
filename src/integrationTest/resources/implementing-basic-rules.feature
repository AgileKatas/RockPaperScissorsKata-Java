Feature: Implementing the Basic Rules

  Scenario Outline: Rock beats scissors
    Given I have chosen <myMove>
    When the opponent chooses <theirMove>
    Then I should <result>

    Examples:
      | myMove   | theirMove | result |
      | rock     | scissors  | win    |
      | scissors | rock      | lose   |

  Scenario Outline: Scissors beats paper
    Given I have chosen <myMove>
    When the opponent chooses <theirMove>
    Then I should <result>

    Examples:
      | myMove   | theirMove | result |
      | scissors | paper     | win    |
      | paper    | scissors  | lose   |
