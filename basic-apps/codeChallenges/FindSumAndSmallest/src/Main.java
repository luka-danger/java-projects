import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        while(scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
            nums.add(num);
        }
    }
}