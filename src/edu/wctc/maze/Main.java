package edu.wctc.maze;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("Which maze would you like to play?\n1.The Fun House Maze\n2.The Beginner Maze");
        String mazeChoice = answer.nextLine().trim();

        MazePlaying play = new MazePlaying();

        if (mazeChoice.equals("1")){
            play.funHouseMaze();
        }
        else if (mazeChoice.equals("2")){
            play.beginnerMaze();
        }
        else
            System.out.println("No maze found!");
    }
}
