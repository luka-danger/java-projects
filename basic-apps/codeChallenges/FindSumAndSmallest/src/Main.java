import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Do you prefer the English or Polish language?: ");
        System.out.println("Wolisz język po angielski czy po polsku?: ");
        System.out.println("Enter 1 for English, Enter 2 for Polish");
        System.out.println("Wybierz 1 dla Angielskiego, Wybierz 2 dla Polskiego");
        int language = scan.nextInt();

        if (language == 1) {
            System.out.print("Hello! This program finds both the smallest number and the sum of all numbers. ");
            System.out.println("");
            System.out.println("Start adding numbers!: ");

            while(scan.hasNextInt()) {
                int num = scan.nextInt();
                nums.add(num);
                if (num < 0) {
                    System.out.print("You entered a negative number. ");
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
        else if (language == 2) {
            System.out.println("Cześć! Ten program znajduje obu najmniejszą liczbę i sumę wszystkich liczb.");
            System.out.println();
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
}