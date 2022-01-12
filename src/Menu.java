import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    Logger logger;
    Scanner s = new Scanner(System.in);
    ArrayList<String> gameHistory = new ArrayList<>();
    boolean playing = true;

    public Menu(Logger logger) {
        this.logger = logger;
//        displayMenu();
    }

    public boolean getStatus() {
        return playing;
    }

    private void setStatus(boolean setMe) {
        System.out.println("");
        System.out.println("exiting");
        this.playing = setMe;
    }

    public void displayMenu() {
        // Logic for showing the menu.

        System.out.println("MAIN MENU");
        System.out.println("=====");
        System.out.println("0. Type 'play' to play the computer.");
        System.out.println("1. Type 'pvp' to battle another human.");
        System.out.println("2. Type 'cvc' to let the computers fight it out.");
        System.out.println("3. Type 'history' to view your game history.");
        System.out.println("4. Type 'quit' to stop playing.");

        String menuChoice = s.nextLine();
        System.out.println(menuChoice);
        switch (menuChoice) {
            case "play" -> {
                // play the game
                HumanPlayer dude = new HumanPlayer("Player 1");
                ComputerPlayer robot = new ComputerPlayer();

                Game game = new Game(dude, robot, logger);

                break;
            }
            case "pvp" -> {
                HumanPlayer p1 = new HumanPlayer("Player 1");
                HumanPlayer p2 = new HumanPlayer("Player 2");
                Game game = new Game(p1, p2, logger);

                break;
            }case "cvc" -> {
                ComputerPlayer p1 = new ComputerPlayer("Robot1");
                ComputerPlayer p2 = new ComputerPlayer("Robot2");
                Game game = new Game(p1, p2, logger);

                break;
            }
            case "history" ->
                    // goto the history page.
                    getHistory();
            case "quit" ->
                    // run the quit routine.
                    setStatus(false);
            default -> {
                System.out.println("Please, enter a valid choice. 'play', 'history' or 'quit' ");
                displayMenu();
            }
        }

    }

    public void getHistory() {

        logger.displayGameHistory();

    }

}
