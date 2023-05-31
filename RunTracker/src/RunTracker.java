import java.lang.reflect.Array;
import java.util.*;


public class RunTracker {
    private static List<String> runs;

    // Create ArrayList to store added run
    public RunTracker() {
        runs = new ArrayList<>();
    }

    //Assign items to runs ArrayList when using addRun()
    public void runTrackerArray() {
        addRun();
    }

    public static <ValueError> void main(String[] args) {
        System.out.println("Welcome to the Run Tracker!");
        /* Initialize runs ArrayList once program starts
        addRun() is called at the start of the program
        This allows you to add a run and related info
        Then you are taken to the start menu where the code runs
        Until the user chooses to exit
         */
        RunTracker runTracker = new RunTracker();
        runTracker.runTrackerArray();
        Scanner select = new Scanner(System.in);
        System.out.println(" Please select an option from the Start Menu.");
        while (true) {
            startMenu();
            // Use try block to prevent code from breaking if non-integer selected
            try {
                // Improve UI
                System.out.print("> ");
                int choice = select.nextInt();
                if (choice == 1) {
                    // Call addRun() and put items in runs ArrayList
                    //RunTracker runTracker = new RunTracker();
                    runTracker.runTrackerArray();
                } else if (choice == 2) {
                    viewRuns();
                } else if (choice == 3) {
                    searchRuns();
                } else if (choice == 4) {
                    deleteRun();
                } else if (choice == 5) {
                    System.out.println("See you next time.");
                    // Terminates code and exits while loop
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
            // Use try block to prevent code from breaking if non-integer selected
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                select.nextLine(); // Consume invalid input
            }
        }

    }

    public static void startMenu() {
        System.out.println("\n=== Run Tracker Main Menu ===");
        System.out.println("1. Add Run");
        System.out.println("2. View Run");
        System.out.println("3. Search Run");
        System.out.println("4. Delete Item");
        System.out.println("5. Quit");
    }

    // Add Run
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

        // Print contents of run ArrayList in output
        public static void viewRuns() {
        System.out.println(runs);
    }

        // Search for a keyword inside runs ArrayList
        public static void searchRuns() {
            if (runs.isEmpty()) {
                System.out.println("No runs are available.");
            }
            else {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a keyword to search for: ");
                String keyword = input.nextLine();

                List<String> searchResults = new ArrayList<>();

                for (String run : runs) {
                    if (run.toLowerCase().contains(keyword.toLowerCase())) {
                        searchResults.add(run);
                    }
                }

                if (searchResults.isEmpty()) {
                    System.out.println("No runs matching the keyword found.");
                } else {
                    System.out.println("Search results:");
                    for (String result : searchResults) {
                        System.out.println(result);
                    }
                }
            }
        }

        // Delete item out of ArrayList
        public static void deleteRun() {
            if (runs.isEmpty()) {
                System.out.println("No runs are available.");
            }
            // Iterate through ArrayList by index and assign a number
            for (int i = 0; i < runs.size(); i++) {
                System.out.println((i + 1) + ". " + runs.get(i));
            }

            // Select item by number to delete
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the run number: ");
            int runNumber = input.nextInt();
            input.nextLine();

            // If a number is selected outside the numbers listed
            if (runNumber < 1 || runNumber > runs.size()) {
                System.out.println("Invalid run number.");
                return;
            }

            // Deletes item from ArrayList
            String deletedRun = runs.remove(runNumber - 1);
            System.out.println("Deleted run: " + deletedRun);
        }

    }








