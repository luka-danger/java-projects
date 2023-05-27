import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*Scanner input = new Scanner(System.in);
        int[] scores = {187, 42, 17, 100, 19};
        //Organize arrays from lowest to highest
        Arrays.sort(scores);
        //Sort will arrange the lowest score first
        //Index 0 will print the first score, which will be the lowest
        int lowScore = scores[0];
        int highScore = scores[scores.length - 1];
        System.out.println("High Score: " + highScore);
        System.out.println("Low Score: " + lowScore);

        //Search for a number in the array
        System.out.println("Enter a value: ");
        int searchResults = input.nextInt();
        int searchLocation = Arrays.binarySearch(scores, searchResults);
        if (searchLocation > -1) {
            System.out.println("Number " + searchResults + " was found at index " + searchLocation + ".");
        } else {
            System.out.println("Number  " + searchResults + " was not found.");
        }
        //Find top two scores with copyOfRange function
        int[] topTwoScores = Arrays.copyOfRange(scores, scores.length - 2, scores.length);
        System.out.println(Arrays.toString(topTwoScores));
        //Find bottom two scores
        int [] bottomTwoScores = Arrays.copyOfRange(scores, 0, scores.length - 3);
        System.out.println(Arrays.toString(bottomTwoScores));

        //Array List and add items to collection
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(93);
        grades.add(85);
        grades.add(99);
        grades.add(87);
        Collections.sort(grades);
        int listSize = grades.size();
        System.out.println("Lowest Grade: " + grades.get(0));
        System.out.println("Highest Grade: " + grades.get(listSize - 1));

        //Create Hashset
        Scanner response = new Scanner(System.in);
        HashSet<String> closet = new HashSet<>();
        closet.add("Shoes");
        closet.add("Jeans");
        closet.add("Shirts");
        closet.add("Hoodies");
        //Search for items in the closet
        System.out.println("What would you like to look for in the closet?: ");
        String searchCloset = response.nextLine();
        if(closet.contains(searchCloset)) {
            System.out.println("The closet contains " + searchCloset);
        }
        else {
            System.out.println("The closet does not contain " + searchCloset);
        }

        //Create Hashmap
        HashMap<Integer, String> nuggetsRoster = new HashMap<>();
        Scanner hello = new Scanner(System.in);
        //Add key value pair to Hashmap
        nuggetsRoster.put(15, "Nikola Jokic");
        nuggetsRoster.put(27, "Jamal Murray");
        nuggetsRoster.put(1, "Michael Porter Jr");
        nuggetsRoster.put(50, "Aaron Gordon");
        nuggetsRoster.put(5, "Kentavious Caldwell-Pope");
        //Search for player by jersey number
        System.out.println("Which player number would you like to search for?: ");
        int jerseyNumber = hello.nextInt();
        //Search for player by ID (Jersey number)
        String player = nuggetsRoster.get(jerseyNumber);
        System.out.println("Number " + jerseyNumber + " on the Denver Nuggets is " + player);

        //Two-Dimensional Array
        int[][] testScores = new int[3][5];
        testScores[0] = new int[] {100, 92, 89, 94, 91};
        testScores[1] = new int[] {82, 85, 83, 81, 87};
        testScores[2] = new int[] {80, 79, 75, 73, 72};
        System.out.println("The lowest score in the class is a " + testScores[2][4]);

        //While Loop
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are trapped in an infinite loop. There is no escape");
        int exit = 1;
        while(exit > 0) {
            System.out.println("Enter the password to Exit the maze: ");
            String password = userInput.nextLine();
            if(password.equalsIgnoreCase("password")) {
                exit -- ;
            }
        }
        System.out.println("Well that's a terrible password.");

        //For Loop - FizzBuzz
        System.out.println("Which number do you want to FizzBuzz to?: ");
        int fizzBuzz = userInput.nextInt();
        for(int i = 1; i <= fizzBuzz; i++) {
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

        //Do...while loop
        Scanner moreInput = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Pick a number: ");
            choose = moreInput.nextInt();
            if(choose % 2 == 1) {
                System.out.println("You chose incorrectly! You are stuck in a loop.");
            }
            else if(choose % 2 == 0) {
                System.out.println("You chose correct!");
            }
        }
        while (choose % 2 == 1);

        //While Loop with Text
        Scanner unicorn= new Scanner(System.in);
        String escapeKey = "";
        while(!escapeKey.equalsIgnoreCase("go away")) {
            System.out.println("Oh no! You're stuck in another loop! Say something: ");
            escapeKey = unicorn.nextLine();
            if(escapeKey.equalsIgnoreCase("stop") || escapeKey.equalsIgnoreCase("quit")) {
                break;
            }
        }
        System.out.println("You escaped the loop!");*/

        //Count even numbers in an array with an enhanced for loop
        int [] coolArray = {1, 17, 42, 5, 74, 32, 101};
        //Set initial count of even numbers to 0
        int evenNumbers = 0;
        //Loop through numbers in the array with enhance
        for (int i : coolArray) {
            //Increase count of even number variable if any number
            //In array divided by 2 has no remainder (is an even number)
            if (i % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.print("The array, " + Arrays.toString(coolArray));
        System.out.println(", contains " + evenNumbers + " even numbers.");
    }
}
