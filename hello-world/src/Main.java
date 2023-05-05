import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //This is my first lines of Java code//
        Scanner scanner_one = new Scanner(System.in);
        System.out.println("Hello, friend. What is your name?");
        String name = scanner_one.nextLine();
        System.out.println("Hello," + name + "! How are you doing today?");
        String question = scanner_one.nextLine();
        /* if(question == "good") {
            System.out.println("That is great to hear!");
        }
        else if (response == "bad") {
            System.out.println("I'm sorry to hear that");
        }*/
        System.out.println("Glad to hear that you are doing " + question.toLowerCase() + "!");
    }
}
/* This comment is going to span multiple lines. I am using it to
practice my skills with Java syntax. I'm not sure what else I should
write so I am just going to keep using words to fill at least three lines.
 */
