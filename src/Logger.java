import java.util.ArrayList;

public class Logger {

    ArrayList<String> gameHistory = new ArrayList<>();


    public Logger() {
        System.out.println("Logger is ready to start logging.");
    }

    public void logGame(int winningNum, String winner, String loser, String winningType, String losingType){
        StringBuilder sb = new StringBuilder();


        sb.append("Player ");
        sb.append(winningNum);
        sb.append(" WINS ");
        sb.append(" with ");
        sb.append(winner);
        sb.append(" and defeated ");
        sb.append(losingType);
        sb.append(" who was using ");
        sb.append(loser);
        // WIN: Player picked rock, computer picked scissors


        // add to array list.
        gameHistory.add(sb.toString());
    }
    public void logTieGame( String sameWeapon ){
        StringBuilder sb = new StringBuilder();


        sb.append("TIE! ");
        sb.append(" You both picked ");
        sb.append(sameWeapon);
        // WIN: Player picked rock, computer picked scissors


        // add to array list.
        gameHistory.add(sb.toString());
    }

    public void displayGameHistory(){
        // get everything out of that list.
        System.out.println("=== Game History ===");
        gameHistory.forEach(string -> System.out.println(string));
        System.out.println();
        System.out.println();
    }
}
