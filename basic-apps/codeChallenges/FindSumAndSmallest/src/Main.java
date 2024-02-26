import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Enter non-negative integers to add to the ArrayList: ");

        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            nums.add(num);
            if (num < 0) {
                System.out.print("You entered a negative integer. ");
                System.out.println("No more integers will be added to the Array List");
                break;
            }
        }

        int smallest = nums.getFirst();
        for(int num : nums) {
            if (num >= 0 && num < smallest) {
                smallest = num;
            }
        }
        System.out.println("Smallest: " + smallest);

        int sum = 0;
        for(int num : nums) {
            if (num > 0) {
                sum = sum + num;
            }
        }
        System.out.println("Sum: " + sum);

    }
}