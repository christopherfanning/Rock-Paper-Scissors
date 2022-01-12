import java.util.Scanner;

public class Menu {

    Scanner s = new Scanner(System.in);

    public Menu() {
        displayMenu();
    }

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
            HumanPlayer dude = new HumanPlayer();
            ComputerPlayer robot = new ComputerPlayer();

            Game game = new Game(dude, robot);

        } else if (menuChoice.equals("history")) {
            // goto the history page.
        } else if (menuChoice.equals("quit")) {
            // run the quit routine.
        } else {
            System.out.println("Please, enter a valid choice. 'play', 'history' or 'quit' ");
        }

    }


}
