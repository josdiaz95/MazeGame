package edu.wctc.maze.funhouse;
import edu.wctc.maze.InvalidActionException;
import edu.wctc.maze.Player;
import edu.wctc.maze.PrintQueue;
import edu.wctc.maze.Room;


public class MirrorRoom extends Room{
    public MirrorRoom(){
        super("Mirror Room",
                "You go up the staircase, you open a door to a room that has mirrors everywhere,its hard to see a way out. Try pushing on the mirrors!");
    }
    @Override
    public void performAction(char action, Player player) throws InvalidActionException {
        PrintQueue queue = PrintQueue.INSTANCE;

         if(action == 'i'){
            player.addToCount(1);
             if (player.getPushCount() < 3){
                 player.addToScore(50);
                 queue.enqueue( "Keep pushing on the mirrors,maybe one will open!");
             }
             else if (player.getPushCount() == 3) {
                 player.addToScore(100);
                 queue.enqueue( "You finally push open a mirror!You see another room.");
             }
             else {
                 player.addToScore(-20);
                 queue.enqueue("What are you waiting for? Go North!");
             }

        }else {
            throw new InvalidActionException();
        }
    }
}
