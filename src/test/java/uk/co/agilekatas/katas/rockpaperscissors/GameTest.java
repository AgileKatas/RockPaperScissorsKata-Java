package uk.co.agilekatas.katas.rockpaperscissors;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

  private Game game = new Game();

  @Test
  public void returnsWinWhenPlayingRockAgainstScissors() {
    String myMove = "rock";
    String theirMove = "scissors";

    String result = game.play(myMove, theirMove);

    assertThat(result).isEqualTo("win");
  }

  @Test
  public void returnsLoseWhenPlayingScissorsAgainstRock() {
    String myMove = "scissors";
    String theirMove = "rock";

    String result = game.play(myMove, theirMove);

    assertThat(result).isEqualTo("lose");
  }
}
