package edu.wctc.maze;
import edu.wctc.maze.io.ConsoleInputService;
import edu.wctc.maze.io.ConsoleOutputService;
import edu.wctc.maze.io.InputService;
import edu.wctc.maze.io.OutputService;

public class MazePlaying {

    public void funHouseMaze(){
        FunHouseConstructionStrategy funHouse = new FunHouseConstructionStrategy();
        Maze maze1 = new Maze( funHouse.createRoom());
        playing(maze1);
    }

    public void beginnerMaze(){
        BeginnerMazeConstructionStrategy beginnerMaze = new BeginnerMazeConstructionStrategy();
        Maze maze2 = new Maze( beginnerMaze.createRoom());
        playing(maze2);
    }

    public void playing(Maze maze){

        InputService in = new ConsoleInputService();
        OutputService out = new ConsoleOutputService();

        while (maze.isPlaying()) {
            out.print(maze.getCurrentRoomName());

            out.print(maze.getCurrentRoomDescription());

            out.print(maze.getCurrentRoomPossibleDirections());

            char command = in.getInput();
            maze.performAction(command);
            PrintQueue queue = PrintQueue.INSTANCE;
            out.print(queue.flush());
        }
        out.print("GAME OVER");
        out.print("Score: " + maze.getScore());
    }
}
