package edu.wctc.maze;
import edu.wctc.maze.companion.CompanionFactory;
import edu.wctc.maze.companion.SiblingCompanionFactory;
import edu.wctc.maze.roomimpl.*;

public class BeginnerMazeConstructionStrategy implements MazeConstructionStrategy {

    CompanionFactory companionFactory = new SiblingCompanionFactory();

    @Override
    public Room createRoom() {

        Room startingRoom = new BasicRoom();


        Room anotherRoom = new DarkRoom();
        startingRoom.setNorth(anotherRoom);
        anotherRoom.setSouth(startingRoom);
        anotherRoom.setCompanion(companionFactory.getGrumpyCompanion());

        Room thirdRoom = new SimpleRoom();
        anotherRoom.setDown(thirdRoom);
        thirdRoom.setUp(anotherRoom);

        Room finalRoom = new BasicRoom();
        anotherRoom.setEast(finalRoom);
        finalRoom.setWest(anotherRoom);

        // Return the starting room
        return startingRoom;
    }
}
