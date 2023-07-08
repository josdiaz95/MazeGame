package edu.wctc.maze;
import edu.wctc.maze.companion.ArtificialIntelligenceCompanionFactory;
import edu.wctc.maze.companion.CompanionFactory;
import edu.wctc.maze.funhouse.*;

public class FunHouseConstructionStrategy implements MazeConstructionStrategy {
    private CompanionFactory companionFactory = new ArtificialIntelligenceCompanionFactory();

    @Override
    public Room createRoom() {

        Room startingRoom = new Lobby();

        Room staircase1 = new DeadEnd1();
        startingRoom.setWest(staircase1);
        staircase1.setEast(startingRoom);

        Room staircase2 = new DeadEnd2();
        startingRoom.setNorth(staircase2);
        staircase2.setSouth(startingRoom);
        staircase2.setCompanion(companionFactory.getGrumpyCompanion());

        Room secondRoom = new MirrorRoom();
        startingRoom.setEast(secondRoom);
        secondRoom.setWest(startingRoom);;


        Room thirdRoom = new BlueRoom();
        secondRoom.setNorth(thirdRoom);
        thirdRoom.setSouth(secondRoom);
        thirdRoom.setCompanion(companionFactory.getHappyCompanion());

        Room roof = new RoofTop();
        thirdRoom.setUp(roof);
        roof.setDown(thirdRoom);

        return startingRoom;
    }

}
