import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to the Run Tracker!");
        System.out.println(" Please select an option from the Start Menu.");
        StartMenu startMenuObject = new StartMenu();
        startMenuObject.displayMenu();
        int choose = input.nextInt();
        // Add Run
        if(choose == 1) {
            //Test case only. Add in methods from addRun()
            System.out.println("Hi");
        }
        // View Runs
        else if(choose == 2) {

        }
        // Search Runs
        else if(choose == 3) {

        }
        // Delete Run
        else if(choose == 4) {

        }
        // Quit
        else if(choose == 5) {

        }
        // Invalid option, please try again
        else {

        }
    }
}


