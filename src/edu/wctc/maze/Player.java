package edu.wctc.maze;
import edu.wctc.maze.companion.Companion;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private boolean playing = true;
    private int score = 0;
    private  int pushCount = 0;
    PrintQueue queue = PrintQueue.INSTANCE;

    private List<String> inventory = new ArrayList<>();
    private List<Companion> companions = new ArrayList<>();

        public void addCompanion(Companion c){
           companions.add(c);
        }

    public void removeCompanion(Companion c){
        companions.remove(c);
    }

    public void addToInventory(String item) {
        inventory.add(item);
        for (Companion c : companions) {
            queue.enqueue(c.playerGainedItem(item));
        }
    }

    public void addToScore(int points) {
        score += points;
        for (Companion c : companions) {
            queue.enqueue(c.playerScoreChange(points));
        }
    }

    public void addToCount(int counter) {
        pushCount += counter;
    }
    public String getInventory() {
        if (inventory.isEmpty()) {
            return "Your pockets are empty!";
        }
        String inv = "You are carrying: ";
        inv += String.join(", " , inventory);
        return inv;
    }

    public int getScore() {
        return score;
    }

    public  int getPushCount(){
            return pushCount;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void quit() {
        playing = false;
    }

}
