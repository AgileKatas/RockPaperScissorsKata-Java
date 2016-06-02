package uk.co.agilekatas.katas.rockpaperscissors;

public class Game {

  public String play(String myMove, String theirMove) {
    if (myMove.equals("rock") && theirMove.equals("scissors"))
      return "win";
    if (myMove.equals("scissors") && theirMove.equals("paper"))
      return "win";
    return "lose";
  }

}
