package uk.co.agilekatas.katas.rockpaperscissors;

public class Game {

  public String play(String myMove, String theirMove) {
    if (myMove.equals(theirMove))
      return "draw";
    if (myMove.equals("rock") && theirMove.equals("scissors"))
      return "win";
    if (myMove.equals("scissors") && theirMove.equals("paper"))
      return "win";
    if (myMove.equals("paper") && theirMove.equals("rock"))
      return "win";
    return "lose";
  }

}
