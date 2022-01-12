import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    private ArrayList<String> gameHistory = new ArrayList<>();
    private int numberOfPlayers;
    private Scanner s = new Scanner(System.in);
    private Player player1;
    private Player player2;


    public Game() {
        // This is a throwaway method that should never get called.
        Scanner s = new Scanner(System.in);
    }

    public Game(HumanPlayer player1, ComputerPlayer player2) {
//        Human vs computer game
        System.out.println("We are starting the dude vs robot game!!!");
        playGame(player1, player2);

    }

    public Game(HumanPlayer player1, HumanPlayer player2) {
//        Human vs human game

    }


    public Game(ComputerPlayer player1, ComputerPlayer player2) {
        // Computer vs computer game
    }


    private void playGame(Player player1, Player player2) {

        System.out.println("Let the games begin!");
        int p1turn = player1.takeTurn();
        int p2turn = player2.takeTurn();

        compareResults(p1turn, p2turn);


    }


    private void compareResults(int p1, int p2) {
        System.out.println("Comparing results");
        String p1Choice = "";
        String p2Choice = "";

        if( p1 == 1){
            // Player has chosen rock
            if (p2 == 2){
                // p2 wins
            }else if (p2 == 3) {
                // p1 wins
            }else{
                // draw condition
            }

        } else if (p1 == 2){
            // p1 chooses paper
            if(p2 == 3){
                // p2 wins
            }else if (p2 == 1){
                // p1 wins
            }else{
                // draw
            }
        } else if (p1 == 3){
            // p1 gets scissors
            if(p2 == 1){
                // p2 wins smashing scissors
            }else if (p2 == 2){
                // p1 wins cutting paper.
            } else {
//                draw.
            }

        } else {
            System.out.println("Something went wrong when trying to determine the winner check compareResults()");
        }


    }


    private void logger(int p1, int p2, Player whoWon){
        // Who won && what did they pick && what was the loser's choice.
       StringBuilder sb = new StringBuilder();


    }

    private void playerWins() {
        // The player wins;
        System.out.println("The player wins!");

    }

    private void computerWins() {
        // The computer overlords win.

        System.out.println("The computer overlords win.");
    }

    private void tieGame() {
    }

}
