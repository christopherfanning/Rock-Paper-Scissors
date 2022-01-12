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


    private void compareResults(int p1turn, int p2turn) {
        System.out.println("Comparing results");


//        if (playerChoice.equals("rock")) {
//
//            if (computerChoice == 3){
//                playerWins();
//            }else if (computerChoice == 2){
//                computerWins();
//            } else {
//                tieGame();
//            }
//
//        } else if (playerChoice.equals("paper")) {
//            if (computerChoice == 1){
//                playerWins();
//            }else if (computerChoice == 3){
//                computerWins();
//            }
//
//        } else if (playerChoice.equals("scissors")) {
//
//            if (computerChoice == 2){
//                playerWins();
//            }else if (computerChoice == 1){
//                computerWins();
//            }
//        } else {
//            playGame();
//        }

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
