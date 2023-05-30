import java.util.Scanner;

public class FibonacciSequence {
    static int n1=0, n2=1, n3=0;
    static void Fibonacci(int count){
        if(count > 0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer ");
        int n = input.nextInt();

    }
    }
}
