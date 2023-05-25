import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

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
        if (searchResults > -1) {
            int searchLocation = Arrays.binarySearch(scores, searchResults);
            System.out.println("Number " + searchResults + " was found at index " + searchLocation + ".");
        }
        else {
            System.out.println("Number  " + searchResults + " was not found.");
        }
        }
}
