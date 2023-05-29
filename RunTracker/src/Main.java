import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public class RunTracker {
        public RunTracker() {
            ArrayList runs = new ArrayList();
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

            //Commenting out until I find a solution for ArrayList
            /*runs.add(mileage + " miles");
            runs.add(elevationGain + " feet");
            runs.add(runTime + " minutes");
            runs.add("Notes: " + runNotes);
            System.out.println(runs);
            System.out.println("Run added!");*/
        }

        public static void viewRuns() {
            System.out.println();
        }

        public static void searchRuns() {
            Scanner search = new Scanner(System.in);
            System.out.println("Enter a keyword to search : ");
            String keyword = search.nextLine();
            //Add for loop to iterate over runs
            /*if(runs.contains(keyword)) {
                System.out.println("Matching runs: " + run);
            }
            else {
                System.out.println("No matching runs found");
            }*/
        }

        public static void deleteRuns() {

        }

        public static void quitProgram() {

        }

        public static void main(String[] args) {
            Scanner select = new Scanner(System.in);
            System.out.print("Welcome to the Run Tracker!");
            System.out.println(" Please select an option from the Start Menu.");
            StartMenu startMenuObject = new StartMenu();
            startMenuObject.displayMenu();
            // Improve UI
            System.out.print("> ");
            int choose = select.nextInt();
            // Select 1 for 1. Add Run
            if (choose == 1) {
                // Call addRun method
                addRun();
            }
            // View Runs
            else if (choose == 2) {
                viewRuns();
            }
            // Search Runs
            else if (choose == 3) {
                searchRuns();
            }
            // Delete Run
            else if (choose == 4) {
                deleteRuns();
            }
            // Quit
            else if (choose == 5) {
                quitProgram();
            }
            // Ensure code continues to run if user enters invalid option
            else {
                System.out.println("Invalid option, please try again");
            }
        }
    }
    }



