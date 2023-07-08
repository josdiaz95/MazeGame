package edu.wctc.maze.funhouse;
import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.PrintQueue;
import edu.wctc.maze.Room;

public class RoofTop extends Room {

    public RoofTop(){
        super("Fun House Roof Top",
                "You are now on the roof top. You see a slide to your left, it leads to the front yard.");
    }
    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        if (action == 'x' ) {
            player.addToScore(200);
            player.quit();
            PrintQueue queue = PrintQueue.INSTANCE;
            queue.enqueue("Get out while you can!");
        }
        else {
            throw new InvalidActionException();
        }
    }
}
