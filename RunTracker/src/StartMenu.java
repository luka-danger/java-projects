public class StartMenu {
    public static void main(String[] args) {
        StartMenu startMenu = new StartMenu();

        boolean quit = false;
        while(!quit) {
            System.out.println("\n=== Run Tracker Main Menu ===");
            System.out.println("1. Add Run");
            System.out.println("2. View Runs");
            System.out.println("3. Search Runs");
            System.out.println("4. Delete Run");
            System.out.println("5. Quit");
        }
    }
}
