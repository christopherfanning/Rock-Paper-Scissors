public class Main {


    public static void main(String[] args) {

        boolean playing = true;

       // Fire-up the logger.
        Logger logger = new Logger();
        // Fire-up the menu
        Menu menu = new Menu(logger);

        System.out.println("the status is " + menu.getStatus());

        while(menu.getStatus()){

            menu.displayMenu();
        }
    }


}
