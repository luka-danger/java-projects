import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    int [] scores = {187, 42, 17, 100, 19};
    Arrays.sort(scores);
    int lowScore = scores[0];
    int highScore = scores[scores.length - 1];
    System.out.println("High Score: " + highScore);
    System.out.println("Low Score: " + lowScore);
    }
}
