import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or phrase to check if is a palindrome: ");
        String string = scan.nextLine();
        String text = string.replaceAll(" ", "").toLowerCase();

        char letter;
        String reverse = "";

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            reverse = letter + reverse;
        }
        if (text.equals(reverse)) {
            System.out.println(string + " is a palindrome.");
        }
        else {
            System.out.println(string + " is NOT a palindrome.");
        }
    }
}