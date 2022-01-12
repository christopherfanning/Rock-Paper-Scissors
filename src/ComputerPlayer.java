public class ComputerPlayer extends Player {


    String type = "Computer";

    public ComputerPlayer() {
        this.type = type;
    }

    public ComputerPlayer(String type) {
        this.type = type;
    }

    public String getName(){
        return "Computer";
    }

    public String getType(){
        return type;
    }

    public int takeTurn() {
        // run random number generator and return the int.

        System.out.println("Computer rolling...");
        double a = Math.random() * 3;
        return (int) a + 1;
    }

}
