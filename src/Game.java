import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    private ArrayList<String> gameHistory = new ArrayList<>();
    private int numberOfPlayers;
    private final Scanner s = new Scanner(System.in);
    private HumanPlayer player1;
    private ComputerPlayer computerPlayer;
    private ComputerPlayer computerPlayer2;
    public Logger logger;



    public Game() {
        // This is a throwaway method that should never get called.
        Scanner s = new Scanner(System.in);
    }

    public Game(HumanPlayer player1, ComputerPlayer computerPlayer, Logger logger) {
        // Human vs computer game
        this.logger = logger;
        this.player1 = player1;

        playGame(this.player1, computerPlayer);

    }

    public Game(HumanPlayer player1, HumanPlayer player2, Logger logger) {
        // Human vs human game
        this.logger = logger;
        this.player1 = player1;

        playGame(this.player1, player2);
    }

    public Game(ComputerPlayer player1, ComputerPlayer player2, Logger logger) {
        // Computer vs computer game
        this.logger = logger;
        this.computerPlayer = player1;
        this.computerPlayer2 = player2;

        playGame(player1, player2);
    }


    private void playGame(Player player1, Player player2) {

        System.out.println("Let the games begin!");
        int p1turn = player1.takeTurn();
        int p2turn = player2.takeTurn();

        compareResults(p1turn, p2turn, player1, player2);


    }


    private void compareResults(int p1, int p2, Player player1, Player player2) {
        System.out.println("Comparing results");
        String[] weapons = {"rock", "paper", "scissors"};

//        System.out.println("p1 is: " + p1 + " and p2 is : " + p2);
        String p1Choice = weapons[p1 - 1];
        String p2Choice = weapons[p2 - 1];

        String winningType = "";
        String losingType = "";

        int winningNum = 0;
        String winner = "";
        String loser = "";


        if (p1 == 1) {
            // Player has chosen rock
            if (p2 == 2) {
                // p2 wins
                winningNum = 2;
            } else if (p2 == 3) {
                // p1 wins
                winningNum = 1;
            } else {
                // draw condition
            }

        } else if (p1 == 2) {
            // p1 chooses paper
            if (p2 == 3) {
                // p2 wins
                winningNum = 2;
            } else if (p2 == 1) {
                // p1 wins
                winningNum = 1;
            } else {
                // draw
            }
        } else if (p1 == 3) {
            // p1 gets scissors
            if (p2 == 1) {
                // p2 wins with a rock
                winningNum = 2;
            } else if (p2 == 2) {
                // p1 wins  with paper
                winningNum = 1;
            } else {
//                draw.
            }

        } else {
            System.out.println("Something went wrong when trying to determine the winner check compareResults()");
        }

        if (winningNum == 1) {
            // player one wins

            winningType = player1.getName();
            losingType = player2.getType();
            winner = p1Choice;
            loser = p2Choice;
            logger.logGame(winningNum, winner, loser, winningType, losingType);
            System.out.println(winningType + " picks " + winner);
            System.out.println(losingType + " picks " + loser);
            System.out.println(winningType + " wins!");

        } else if (winningNum == 2) {
            // player 2 wins
            winningType = player2.getType();
            losingType = player1.getType();
            winner = p2Choice;
            loser = p1Choice;
            logger.logGame(winningNum, winner, loser, winningType, losingType);
            System.out.println(winningType + " picks " + winner);
            System.out.println(losingType + " picks " + loser);
            System.out.println(winningType + " wins!");

        } else {
            System.out.println("It's a tie! You both picked " + p1Choice );
            logger.logTieGame(p1Choice);
        }


        System.out.println();
        System.out.println();


    }




}
