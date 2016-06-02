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

  Scenario Outline: Paper beats rock
    Given I have chosen <myMove>
    When the opponent chooses <theirMove>
    Then I should <result>

    Examples:
      | myMove | theirMove | result |
      | paper  | rock      | win    |
      | rock   | paper     | lose   |

  Scenario Outline: Same moves result in a draw
    Given I have chosen <myMove>
    When the opponent chooses <theirMove>
    Then I should <result>

    Examples:
      | myMove   | theirMove | result |
      | rock     | rock      | draw   |
      | scissors | scissors  | draw   |
      | paper    | paper     | draw   |
