import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int first = read.nextInt();
        System.out.println("Enter another number: ");
        int second = read.nextInt();
        System.out.println("Enter a third number: ");
        int third = read.nextInt();

        int tempSmall = (first < second) ? first : second;

        int smallestInt = (tempSmall < third) ? tempSmall : third;

        System.out.println("Smallest number: " + smallestInt);
    }
}