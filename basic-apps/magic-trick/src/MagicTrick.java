import java.util.Random;
import java.util.Scanner;

public class MagicTrick {
    public static void main(String[] args) {
        //Create a random number generator
        Random randomNumberGenerator = new Random();
        final int maxValue = 5;
        final int minValue = 1;
        //Pick a random number between 1 and 5
        int guessingNumber = randomNumberGenerator.nextInt(maxValue) + minValue;
        //Use for calculation in line 
        int addingNumber = guessingNumber * 2;
        //Read user input
        Scanner userInput = new Scanner(System.in);

        //Start 'magic trick'
        System.out.println("Hello! What is your name? ");
        String name = userInput.nextLine();
        System.out.println("Hi, " + name + "! Now I will perform some mind reading on you.");
        System.out.println("Think of a number between 1 and 10.");
        System.out.println("Hit enter when have picked your number.");
        //Pause code until event is triggered (Press enter)
        userInput.nextLine();

        System.out.println("Multiply the number by 2.");
        System.out.println("Hit enter when have picked your number.");
        userInput.nextLine();

        System.out.println("Add " + addingNumber + ".");
        System.out.println("Hit enter when have picked your number.");
        userInput.nextLine();

        System.out.println("Divide the number by 2.");
        System.out.println("Hit enter when have picked your number.");
        userInput.nextLine();

        System.out.println("Now, subtract the original number.");
        System.out.println("Hit enter when have picked your number.");
        userInput.nextLine();

        System.out.println("I see the number in your mind...");
        System.out.println("The number that you have now is " + guessingNumber + ".");

        //Test Code (Add /* */ when not using)
        /*System.out.print("Enter the number guessed between 1 and 10: ");
        int numberEntered = userInput.nextInt();
        userInput.nextLine();

        int currentNumber = numberEntered * 2;
        System.out.print("Current Number x 2 = " + currentNumber);
        userInput.nextLine();

        currentNumber = currentNumber + addingNumber;
        System.out.print("Current number + " + addingNumber + " = " + currentNumber);
        userInput.nextLine();

        currentNumber = currentNumber / 2;
        System.out.print("Current number / 2 = " + currentNumber);
        userInput.nextLine();

        currentNumber = currentNumber - numberEntered;
        System.out.print("Current number - " + numberEntered + " = " + currentNumber);*/
    }
}

