package uk.co.agilekatas.katas.rockpaperscissors.steps;

import uk.co.agilekatas.katas.rockpaperscissors.Game;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class GameSteps {

  private String myMove;
  private String theirMove;

  private Game game = new Game();

  @Given("^I have chosen ([^\"]*)$")
  public void I_have_chosen_myMove(String move) throws Throwable {
    this.myMove = move;
  }

  @When("^the opponent chooses ([^\"]*)$")
  public void the_opponent_chooses_theirMove(String move) throws Throwable {
    this.theirMove = move;
  }

  @Then("^I should ([^\"]*)$")
  public void I_should_result(String result) throws Throwable {
    assertThat(game.play(myMove, theirMove)).isEqualTo(result);
  }

}
