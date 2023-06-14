import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        // Set integer to variable that will be used as condition in for loop
        int num = input.nextInt();
        /* Initialization - create integer and set to 1
           Condition - if i is less than or equal to num
           Increment i by 1 for every iteration
         */
        for(int i = 1; i <= num; i++) {
            // If number is divisible by 3 and 5 with no remainder
            if (i % 3 ==0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // If number is divisible by 3 with no remainder
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            // If number is divisible by 5 with no remainder
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // All other numbers - any number divisible by 3, 5, or both with remainder
            else {
                System.out.println(i);
            }
        }
    }
}
