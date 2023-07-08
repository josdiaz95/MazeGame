package edu.wctc.maze.funhouse;
import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.PrintQueue;
import edu.wctc.maze.Room;

public class BlueRoom extends Room {
    public BlueRoom(){
        super("Blue Room",
                "This room is blue all around, even the floors. There are no doors or windows! But there is an exit sign on the ceiling. You see a purple ladder in the corner.");
    }
    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        PrintQueue queue = PrintQueue.INSTANCE;
      if (action == 'l'){
          player.addToScore(50);
          player.addToInventory("Ladder");
          queue.enqueue("Nice!You've got the ladder!Now, use it!");
      }
      else if (action == 'i'){
          player.addToScore(50);
          queue.enqueue("You climb the ladder and push a button on the ceiling. It opens up a trap door.");
      }
      else {
            throw new InvalidActionException();
        }
    }
}
