import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        int language = scan.nextInt();
        System.out.println("Do you prefer the English or Polish language?: ");
        System.out.println("Wolisz język po angielski czy po polsku?: ");
        System.out.println("Enter 1 for English, Enter 2 for Polish");
        System.out.println("Wybierz 1 dla Angielskiego, Wybierz 2 dla Polskiego");

        System.out.println("Hello! This program will take any number of user input integers to find the smallest non-negative number. ");
        System.out.println("It will then find the sum of all non-negative integers. ");
        System.out.println("Start adding numbers!: ");

        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            nums.add(num);
            if (num < 0) {
                System.out.print("You entered a negative integer. ");
                System.out.println("No more numbers will be added.");
                break;
            }
        }

        int smallest = nums.getFirst();
        for(int num : nums) {
            if (num >= 0 && num < smallest) {
                smallest = num;
            }
        }
        System.out.println("The smallest non-negative number: " + smallest);

        int sum = 0;
        for(int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        System.out.println("The sum of all non-negative numbers: " + sum);

    }
}