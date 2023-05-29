import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
        public static void addRun() {
            ArrayList runs = new ArrayList();
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
            System.out.println(runs);
            System.out.println("Run added!");
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

            }
            // Search Runs
            else if (choose == 3) {

            }
            // Delete Run
            else if (choose == 4) {

            }
            // Quit
            else if (choose == 5) {

            }
            // Invalid option, please try again
            else {

            }
        }
    }



