//Import Java utilities
import java.util.Objects;
import java.util.Scanner;
import java.util.Arrays;

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
        System.out.println("Enter 2 or more words separated by spaces: ");
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

        //Test If and Else Statement
        Scanner next = new Scanner(System.in);
        String postCard = ("Greetings from Hawaii");
        System.out.println("Would you like a post card? (Y) or (N): ");
        String answer = next.nextLine();
        if (Objects.equals(answer, "Y")) {
        System.out.println(postCard);
        } else if (Objects.equals(answer, "N")) {
        System.out.println("How boring.");
        }
        //If user enters something other than Y or N
        else {
        System.out.println("You're not good at following directions, are you?");
        }

        //Test Logical and Boolean Operators
        System.out.println("Enter a number: ");
        int num1 = hello.nextInt();
        int num2 = 2;
        int num3 = num1 * num2;
        if(num1 == num2){
            System.out.println("The square root of " + num3 + " is " + num1);
        } else if(num2 == num3 || num3 < num2){
            System.out.println(num1 + "is <= to 1");
        } else{
            System.out.println(num3);
        }

        //Test try and catch block
        //Add a while loop to make code run until an integer is entered
        System.out.println("Please enter your age in years: ");
            try {
                int age = hello.nextInt();
                System.out.println("Your are " + age + " years old.");
            } catch (Exception ex) {
                System.out.println("That's not a number.");
                System.out.println("Please run again & enter a valid age.");
            }

        //Test single-dimensional arrays
        int [] nbaScores = {126, 117, 112, 103, 97};
        String[] nbaTeams = {"Nuggets", "Thunder", "Bucks", "Lakers", "Hawks"};
        System.out.println("The " + nbaTeams[0] + " scored " + nbaScores[0] + " points.");
        int [] randomNumbers = new int [3];
        randomNumbers[0] = 22;
        randomNumbers[1] = 37;
        randomNumbers[2] = 138;
        System.out.println(randomNumbers[2]);
        Arrays.sort(nbaScores);
        System.out.println(Arrays.toString(nbaScores));

        //More Arrays Test
        int [] someNumbers = {7, 12};
        System.out.println(someNumbers[0] + someNumbers[1]);
        someNumbers[1] = 6;
        System.out.println(someNumbers[0] + someNumbers[1]);

        //Test Index in Array with a catch block
        String[] showList = {"Breaking Bad", "The Office", "Peaky Blinders"};
        System.out.println("Choose a show to watch: ");
        System.out.println("1. " + showList[0]);
        System.out.println("2. " + showList[1]);
        System.out.println("3. " + showList[2]);
        System.out.println("Enter selection #: ");
        int choice = 0;
        try {
            choice = hello.nextInt();
        }
        // If user doesn't enter a number
        catch(Exception ex) {
            System.out.println("That's not a number.");
        }
        //Subtract 1 from choice
        choice--;
        try {
            System.out.println("You are watching " + showList[choice]);
        }
        //Prevents code from breaking
        //Add a while loop to make code run until the right selection is entered
        catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("Not a valid selection.");
        }

        //Modify Single Index in Array
        String[] fruits = {"apple", "orange", "banana"};
        System.out.println("Original List: " + fruits[0] + " "+ fruits[1] + " " + fruits[2]);
        fruits[0] = "kiwi";
        System.out.println("Modified List: " + fruits[0] + " "+ fruits[1] + " " + fruits[2]);

        //Modify Whole Array
        String[] veggies = {"carrot", "broccoli", "celery"};
        System.out.println("Original List: " + veggies[0] + " "+ veggies[1] + " " + veggies[2]);
        veggies = new String[]{"pepper", "squash", "spinach"};
        System.out.println("New List: " + veggies[0] + " "+ veggies[1] + " " + veggies[2]);

        
    }
}
