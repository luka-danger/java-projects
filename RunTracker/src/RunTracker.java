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
                viewRuns();
            } else if (choose == 3) {
                searchRuns();
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

    public static void viewRuns() {
        if (runs.isEmpty()) {
            System.out.println("No runs are available.");
        } else {
            System.out.println(runs);
        }
    }

        public static void searchRuns() {
            if (runs.isEmpty()) {
                System.out.println("No runs are available.");
            } else {
                Scanner searchBar = new Scanner(System.in);
                System.out.println("Enter a keyword to search for: ");
                searchBar.nextLine();

                if (runs.contains(searchBar)) {
                    System.out.println(searchBar + " found!");
                }
            }

        }
    }







