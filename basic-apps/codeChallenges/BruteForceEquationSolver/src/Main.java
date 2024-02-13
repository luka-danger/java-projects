import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("For Ax + By = C");
        System.out.println("Enter A: ");
        int ax = scan.nextInt();
        System.out.println("Enter B: ");
        int by = scan.nextInt();
        System.out.println("Enter C: ");
        int answer = scan.nextInt();
        int algebra;

        System.out.println("For Cx + Dy = E");
        System.out.println("Enter C: ");
        int cx = scan.nextInt();
        System.out.println("Enter D: ");
        int dy = scan.nextInt();
        System.out.println("Enter E: ");
        int answer2 = scan.nextInt();
        int algebra2;
        boolean hasSolution = false;

        for (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                algebra = (ax * i) + (by * j);
                algebra2 = (cx * i) + (dy * j);
                if (algebra == answer && algebra2 == answer2) {
                    ax = i;
                    by = j;
                    hasSolution = true;
                    break;
                }
            }
        }

        if (hasSolution) {
            System.out.println("x = " + ax + ", " + "y = " + by);
        }
        else {
            System.out.println("Input has no solution.");
        }



    }
}