public abstract class Player {

    private String selection;

    public Player() {
        System.out.println(this.getClass() + "Got made!");
    }

    public int takeTurn() {
        // Some turn taking logic.
        return -1;
    }



}
