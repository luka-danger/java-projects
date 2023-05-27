import java.util.Scanner;
import java.util.Arrays;

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String userName = input.nextLine();
        String greeting = sayHello(userName);
        String beNice = saySomethingNice(userName);
        System.out.println(greeting + " Welcome to Java!");
        System.out.println(beNice);
        String response = input.nextLine();

        if(response.equalsIgnoreCase("thank you")) {
            System.out.println("You're welcome, " + userName + ".");
        }
        int[] myArray = {8, 10, 4, 12, 2, 6};
        System.out.println("Original: " + Arrays.toString(myArray));
        sortArray(myArray);
        System.out.println("New: " + Arrays.toString(myArray));
    }
}
