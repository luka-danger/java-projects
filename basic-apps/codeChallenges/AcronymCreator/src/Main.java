import java.util.Scanner;

public class Main {
    public static String createAcronym(String userPhrase) {
        String[] words = userPhrase.split(" ");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                acronym.append(Character.toUpperCase(word.charAt(0))).append(".");
            }
        }

        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a phrase to abbreviate: ");
        System.out.println(createAcronym(scan.nextLine()));

    }
}