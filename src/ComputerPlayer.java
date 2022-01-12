public class ComputerPlayer extends Player {




    public int takeTurn() {
        // run random number generator and return the int.

        System.out.println("Computer rolling...");
        double a = Math.random() * 3;
        return (int) a + 1;
    }

}
