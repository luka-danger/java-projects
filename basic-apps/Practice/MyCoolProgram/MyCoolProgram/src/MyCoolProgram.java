import java.util.Scanner;

public class MyCoolProgram {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        // type identifier = new type();
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("Hello, " + name + "!");
        System.out.println(" How are you doing today,? Type 'good' or 'bad'");
        String reply = scanner.nextLine();
        if (reply.contains("good")) {
            System.out.println("Well I hope the rest of the day is terrible.");
        }
        else if (reply.contains("bad")) {
            System.out.println("I'm so happy to hear that.");
        }
        String string = "This is a string";
        String easier = "Wow, cool! " + string;
        System.out.println(easier);

        int x = 5; // primitive
        Integer y = 5; // object (conversion to object is called "autobox")
        System.out.println(x);
        System.out.println(y);
        final double pi = 3.14159265;
        final float pie = 3.14159265f;
        System.out.println(pi + pie);
    }
}

// statically types = variables are given data types up front
// dynamically types = variables do not have types (like in JavaScript)

// primitive types
// Boolean, byte, char, short, int, long, float, double


// Objects
// An object is an instance of a class (Class is the data type, unlimited types)