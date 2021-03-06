import java.util.Locale;
import java.util.Scanner;

public class HumanPlayer extends Player {

    String type = "Human";
    String name = "";

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return type;
    }

    public int takeTurn() {
        Scanner s = new Scanner(System.in);

        System.out.println("Choose your weapon before entering battle...");
        System.out.println("'scissors', 'paper', 'rock'");
        String playerChoice = s.nextLine();

        if (playerChoice.substring(0, 1).equalsIgnoreCase("r")) {
            return 1;
        } else if (playerChoice.substring(0, 1).equalsIgnoreCase("p")) {
            return 2;
        } else if (playerChoice.substring(0, 1).equalsIgnoreCase("s")) {
            return 3;
        }

        return -1;

    }


}
