package edu.wctc.maze.companion;

public class ArtificialIntelligenceCompanionFactory implements CompanionFactory {

    @Override
    public Companion getHappyCompanion() {
        return new Siri();
    }

    @Override
    public Companion getGrumpyCompanion() {
        return new Megan();
    }
}
