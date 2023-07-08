package edu.wctc.maze.companion;

public class Megan implements Companion {
    @Override
    public String getName() {
        return "Megan";
    }

    @Override
    public String playerScoreChange(int points) {
        if (points < 0){
            return "Megan giggles at your failure.";
        }
        return "Megan rolls her eyes.";
    }

    @Override
    public String playerGainedItem(String item) {
        return String.format("Mega 'sighs' because you acquired the %s",item);
    }

    @Override
    public int getPoints() {
        return -100;
    }

}