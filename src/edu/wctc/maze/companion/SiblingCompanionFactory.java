package edu.wctc.maze.companion;

public class SiblingCompanionFactory implements CompanionFactory{
    @Override
    public Companion getHappyCompanion() {
        return new Sister();
    }
    @Override
    public Companion getGrumpyCompanion() {
        return new BabyBrother();
    }
}
