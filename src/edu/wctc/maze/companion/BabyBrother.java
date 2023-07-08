package edu.wctc.maze.companion;

public class BabyBrother implements Companion {
    @Override
    public String getName() {
        return "Davey";
    }

    @Override
    public int getPoints() {
        return -50;
    }
    @Override
    public String playerScoreChange(int points) {
        if (points < 0){
            return "Davey laughs hysterically at your failure.";
        }
        return "Davey throws a tantrum!";
    }
    @Override
    public String playerGainedItem(String item) {
        return String.format("Davey cries because you acquired the %s!",item);
    }

}
