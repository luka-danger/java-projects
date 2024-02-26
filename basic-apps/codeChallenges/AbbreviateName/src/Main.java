import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;
        System.out.println("Enter a full name to abbreviate: ");
        String [] names = scan.nextLine().split("\\s+");

        if (names.length == 3) {
            firstName = names[0];
            middleName = names[1];
            lastName = names[2];
            System.out.format("%s., %s %s.\n", lastName.charAt(0), firstName, middleName.charAt(0));
        }

        else if (names.length == 2) {
            firstName = names[0];
            lastName = names[1];
            System.out.format("%s., %s\n", lastName.charAt(0), firstName);
        }
        else {
            firstName = names[0];
            System.out.println(names);
        }
    }
}