package edu.wctc.maze.funhouse;
import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.Room;


public class Lobby extends Room {

    public Lobby(){
        super("Fun House Lobby",
                "This room is huge and brightly colored. There are staircases in each direction but only one leads to a way out.");
    }
    @Override
    public void performAction(char action, Player player) throws InvalidActionException {

    }
}
