package edu.wctc.maze.companion;

public class Sister implements Companion {

    @Override
    public String getName() {
        return "Sally";
    }

    @Override
    public int getPoints() {
        return 50;
    }

    @Override
    public String playerScoreChange(int points) {
        if (points < 0){
            return "Sally tries to lift yours spirit as you fail.";
        }
        return "Sally hugs you!";
    }
    @Override
    public String playerGainedItem(String item) {
        return String.format("Sally is so happy because you acquired the %s!",item);
    }

}
