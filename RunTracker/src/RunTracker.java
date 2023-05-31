import java.lang.reflect.Array;
import java.util.*;


public class RunTracker {
    private static List<String> runs;

    public RunTracker() {
        runs = new ArrayList<>();
    }

    public void runTrackerArray() {
        addRun();
    }

    public static <ValueError> void main(String[] args) {
        Scanner select = new Scanner(System.in);
        System.out.print("Welcome to the Run Tracker!");
        System.out.println(" Please select an option from the Start Menu.");
        while (true) {
            startMenu();
            try {
                System.out.print("> ");
                int choice = select.nextInt();
                if (choice == 1) {
                    RunTracker runTracker = new RunTracker();
                    runTracker.runTrackerArray();
                } else if (choice == 2) {
                    viewRuns();
                } else if (choice == 3) {
                    searchRuns();
                } else if (choice == 4) {
                    deleteRun();
                } else if (choice == 5) {
                    System.out.println("See you next time.");
                    break;
                } else {
                    System.out.println("Invalid choice. Try again.");
                }
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
        System.out.println(runs);
    }

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
        public static void deleteRun() {
            if (runs.isEmpty()) {
                System.out.println("No runs are available.");
            }
            for (int i = 0; i < runs.size(); i++) {
                System.out.println((i + 1) + ". " + runs.get(i));
            }

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the run number: ");
            int runNumber = input.nextInt();
            input.nextLine(); // Consume newline

            if (runNumber < 1 || runNumber > runs.size()) {
                System.out.println("Invalid run number.");
                return;
            }

            String deletedRun = runs.remove(runNumber - 1);
            System.out.println("Deleted run: " + deletedRun);
        }

    }








