public abstract class Player {

    private String selection;
    String type = "Default type";

    public Player() {
//        System.out.println(this.getClass() + "Got made!");
    }

    public String getName() {
       return "Default Name" ;
    }

    public int takeTurn() {
        // Some turn taking logic.
        return -1;
    }


    public String getType(){
        return type;
    }



}
