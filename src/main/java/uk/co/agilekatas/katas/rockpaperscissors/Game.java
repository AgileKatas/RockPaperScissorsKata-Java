package uk.co.agilekatas.katas.rockpaperscissors;

public class Game {

  public String play(String myMove, String theirMove) {
    if (myMove.equals("rock"))
      return "win";
    return "lose";
  }

}
