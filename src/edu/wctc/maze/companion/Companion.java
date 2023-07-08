package edu.wctc.maze.companion;

public interface Companion {
    String getName();
    int getPoints();
    String playerScoreChange(int points);
    String playerGainedItem(String item);

}
