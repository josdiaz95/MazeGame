package edu.wctc.maze.roomimpl;

import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.PrintQueue;
import edu.wctc.maze.Room;

public class SimpleRoom extends Room {
    public SimpleRoom() {
        super("Simple Room",
                "'Minimalist' would be a nice way of describing this room.");
    }

    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        if (action == 'l') {
            player.addToInventory("Scraps");
            PrintQueue queue = PrintQueue.INSTANCE;
            queue.enqueue("Wow, there were some amazing treasures hidden here... at one time.");
        } else {
            throw new InvalidActionException();
        }
    }
}
