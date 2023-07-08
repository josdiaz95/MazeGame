package edu.wctc.maze.funhouse;
import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.PrintQueue;
import edu.wctc.maze.Room;


public class DeadEnd1 extends Room {
    public DeadEnd1() {
        super("Dead End",
                "There's a door at the top of the steps.Try to open it!");
    }

    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        if (action == 'i') {
            player.addToScore(-20);
            PrintQueue queue = PrintQueue.INSTANCE;
            queue.enqueue("You can't open the door!Try a different path!");
        } else {
            throw new InvalidActionException();
        }
    }
}

