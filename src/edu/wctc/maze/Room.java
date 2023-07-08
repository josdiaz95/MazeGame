package edu.wctc.maze;
import edu.wctc.maze.companion.Companion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class Room {
    private String name, description;
    private Map<Character, Room> connectedRooms = new HashMap<>();

    private Companion companionInRoom;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Room getAdjoiningRoom(char direction) throws NoAdjoiningRoomException {
        if (connectedRooms.containsKey(direction)) {
            return connectedRooms.get(direction);
        }
        throw new NoAdjoiningRoomException(direction);
    }

    public String getDescription() {
        if (companionInRoom == null) {
            return this.description;
        }
        return String.format("%s%n%s is here,%s wants to join you!",this.description,companionInRoom.getName(),companionInRoom.getName());
    }

    public String getName() {
        return name;
    }

    public String getPossibleDirections() {
        List<String> directions = connectedRooms.keySet()
                .stream()
                .map(direction -> {
                    switch (direction) {
                        case 'n':
                            return "North";
                        case 's':
                            return "South";
                        case 'e':
                            return "East";
                        case 'w':
                            return "West";
                        case 'u':
                            return "Up";
                        case 'd':
                            return "Down";
                    }
                    return "";
                }).collect(Collectors.toList());

        return directions.isEmpty() ?
                "You don't see any exits." :
                "The exits are: " + String.join(", ", directions);
    }

    public abstract void performAction(char action, Player player) throws InvalidActionException;

    public String recruitCompanion(Player player) {
       if (companionInRoom != null){
           player.addCompanion(companionInRoom);
           player.queue.enqueue(companionInRoom.getName() + " is with you.");
           player.addToScore(companionInRoom.getPoints());
           companionInRoom = null;
           return player.queue.flush();
       }
      return "There's no companion here for you.";
    }
    public void setCompanion(Companion companion) {
        this.companionInRoom = companion;
    }

    public void setDown(Room room) {
        connectedRooms.put('d', room);
    }

    public void setEast(Room room) {
        connectedRooms.put('e', room);
    }

    public void setNorth(Room room) {
        connectedRooms.put('n', room);
    }

    public void setSouth(Room room) {
        connectedRooms.put('s', room);
    }

    public void setUp(Room room) {
        connectedRooms.put('u', room);
    }

    public void setWest(Room room) {
        connectedRooms.put('w', room);
    }
}
