import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        while (exit > 0) {
            System.out.println("Enter the code to Exit the maze: ");
            exit = userInput.nextInt();
        }
        System.out.println("You escaped the infinite loop!");

    }
}
