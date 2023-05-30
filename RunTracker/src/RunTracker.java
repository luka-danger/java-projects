import java.util.*;

public class RunTracker {
    private static List<String> runs;

    public RunTracker() {
        runs = new ArrayList<>();
    }

    public void runTrackerArray() {
        addRun();
    }

    public static void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.print("Welcome to the Run Tracker!");
        System.out.println(" Please select an option from the Start Menu.");
        String programOn = "";
        while (!programOn.toLowerCase().equals("exit")) {
            startMenu();
            System.out.print("> ");
            int choose = select.nextInt();
            if (choose == 1) {
                // Call addRun method
                RunTracker runTracker = new RunTracker();
                runTracker.runTrackerArray();
            } else if (choose == 2) {
                searchRun();
            } else if (choose == 3) {

            } else if (choose == 4) {

            } else if (choose == 5) {
                System.out.println("See you next time.");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
    }


    public static void startMenu() {
        System.out.println("\n=== Run Tracker Main Menu ===");
        System.out.println("1. Add Run");
        System.out.println("2. View Runs");
        System.out.println("3. Search Runs");
        System.out.println("4. Delete Run");
        System.out.println("5. Quit");
    }

    public static void addRun() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter mileage: ");
        double mileage = input.nextDouble();
        System.out.println("Enter elevation gain: ");
        int elevationGain = input.nextInt();
        System.out.println("Enter run duration (in minutes): ");
        double runTime = input.nextDouble();
        // Ensure the blank space isn't being used in the runNotes variable
        input.nextLine();
        System.out.println("Enter run notes: ");
        String runNotes = input.nextLine();

        runs.add(mileage + " miles");
        runs.add(elevationGain + " feet");
        runs.add(runTime + " minutes");
        runs.add("Notes: " + runNotes);
        System.out.println("Run added!");
    }
    public static void searchRun() {
        System.out.println(runs);
    }
}





