package edu.wctc.maze.companion;

public class Siri implements Companion{
    @Override
    public String getName() {
        return "Siri";
    }

    @Override
    public int getPoints() {
        return 100;
    }

    @Override
    public String playerScoreChange(int points) {
        if (points < 0){
            return "Siri cries for you in her robot voice.";
        }
        return "Siri congratulates you!";
    }
    @Override
    public String playerGainedItem(String item) {
        return String.format("Siri says 'Yay' because you acquired the %s!",item);
    }
}
