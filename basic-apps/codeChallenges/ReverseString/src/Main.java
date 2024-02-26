import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word to reverse: ");
        String userInput = scan.nextLine();
        char letter;
        String reversedString = "";

        for (int i = 0; i < userInput.length(); i++) {
            letter = userInput.charAt(i);
            reversedString = letter + reversedString;
        }
        System.out.println(reversedString);
    }
}