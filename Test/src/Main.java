//Import Java utilities
import java.util.Scanner;

//Testing different aspects of Java
//Using this as my test program for CS1101:'Intro to Java'
public class Main {
    public static void main(String[] arg) {
        //Test the Upper and Lower Case Methods
        String funny = "Pickle";
        System.out.println(funny.charAt(2));
        String chilling = "I AM EASILY DISTRACTED";
        String school = "i hope I finish school soon";
        String test = "does THIS wOrK";
        String test2 = "hoW abOUT THIS";
        System.out.println(chilling.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(test.toLowerCase());
        System.out.println(test2.toUpperCase());

        //Test the nextLine and replace method
        Scanner hello = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = hello.nextLine();
        System.out.println("Hello " + name + "! " + chilling.replace("I AM" , "YOU ARE"));

        //Test more next methods
        System.out.print("Enter 2 or more words separated by spaces: ");
        String inputRead = hello.next();
        System.out.println("Input read by next(): " + inputRead);
        String stringInput = hello.next();
        char singleChar = stringInput.charAt(0);
        System.out.println("You entered " + singleChar + ".");

        //Test string concatenation
        int lineNumber = 1;
        String firstString = lineNumber + ". First Place.\n";
        lineNumber++;
        String secondString = lineNumber + ". Second Place.";
        System.out.println(firstString + secondString);
    }
}
