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
        //Test if startMenuObject works(Delete later)
        if(choose == 1) {
            System.out.println("Hi");
        }
    }
}


