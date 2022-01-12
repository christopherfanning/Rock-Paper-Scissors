import java.util.ArrayList;
import java.util.Scanner;

public class Game {


    private ArrayList<String> gameHistory = new ArrayList<>();
    private int numberOfPlayers;
    private Scanner s;

    public Game() {
        Scanner s = new Scanner(System.in);
    }

    public Game(Player player1, Player player2) {
        Scanner s = new Scanner(System.in);
    }

    public void startGame() {
        displayMenu();
    }

    // Different constructors for computer vs human -or- computer.vs.computer -or- human.vs.computer.


    private void displayMenu() {
        // Logic for showing the menu.

        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("1. Type 'play' to play.");
        System.out.println("2. Type 'history' to view your game history.");
        System.out.println("3. Type 'quit' to stop playing.");

        String menuChoice = s.nextLine();
        System.out.println(menuChoice);
        if (menuChoice.equals("play")) {
            // play the game
        } else if (menuChoice.equals("history")) {
            // goto the history page.
        } else if (menuChoice.equals("quit")) {
            // run the quit routine.
        } else if (menuChoice.equals("g")) {
            System.out.println(computerPlayer());

        } else {
            System.out.println("Please, enter a valid choice. 'play', 'history' or 'quit' ");
        }

    }


    private void playGame() {


        int computerChoice = computerPlayer();

        System.out.println("Choose your weapon before entering battle...");
        System.out.println("'scissors', 'paper', 'rock'");


        String playerChoice = s.nextLine();

        if (playerChoice.equals("rock")) {

            if (computerChoice == 3){
                playerWins();
            }else if (computerChoice == 2){
                computerWins();
            } else {
                tieGame();
            }

        } else if (playerChoice.equals("paper")) {
            if (computerChoice == 1){
                playerWins();
            }else if (computerChoice == 3){
                computerWins();
            }

        } else if (playerChoice.equals("scissors")) {

            if (computerChoice == 2){
                playerWins();
            }else if (computerChoice == 1){
                computerWins();
            }
        } else {
            playGame();
        }

    }


    private int computerPlayer() {
        double a = Math.random() * 3;
        return (int) a + 1;
    }


    private void playerWins(){
        // The player wins;
        System.out.println("The player wins!");

    }

    private void computerWins(){
       // The computer overlords win.

        System.out.println("The computer overlords win.");
    }

    private void tieGame(){}

}
