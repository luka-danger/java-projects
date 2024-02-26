import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class SayHello {
    static String sayHello(String name) {
        return "Hello, " + name + ".";
    }
    static String saySomethingNice(String name) {
        return "You look nice today, " + name + ".";
    }
    static void sortArray(int[] values) {
        Arrays.sort(values);
    }
    static void makeOrganizedArray(ArrayList<Integer> values) {
        Collections.sort(values);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String userName = input.nextLine();
        // Use sayHello method to return "Hello" and entered userName
        String greeting = sayHello(userName);
        // Use saySomethingNice method to return statement and userName
        String beNice = saySomethingNice(userName);
        System.out.println(greeting + " Welcome to Java!");
        System.out.println(beNice);
        String response = input.nextLine();
        // If user types "thank you", the output will return "you're welcome"
        // If any other response or action given, the code continues without an output
        if(response.equalsIgnoreCase("thank you")) {
            System.out.println("You're welcome, " + userName + ".");
        }
        int[] myArray = {8, 10, 4, 12, 2, 6};
        System.out.println("Original: " + Arrays.toString(myArray));
        // Use myArray method to sort array from smallest to largest integer
        sortArray(myArray);
        System.out.println("New: " + Arrays.toString(myArray));

        ArrayList<Integer> milesRan = new ArrayList<>();
        System.out.println("How many runs did you have this week?: ");
        int runCount = input.nextInt();
        int loggedRuns = 0;
        while(loggedRuns < runCount) {
            System.out.println("Enter miles completed on run: ");
            milesRan.add(runCount);
            loggedRuns += 1;
        }
        makeOrganizedArray(milesRan);
        System.out.println("Your miles this week " + milesRan);

    }
}
