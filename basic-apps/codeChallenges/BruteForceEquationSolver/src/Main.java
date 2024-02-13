import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ax = scan.nextInt();
        int by = scan.nextInt();
        int answer = scan.nextInt();
        int algebra;

        int cx = scan.nextInt();
        int dy = scan.nextInt();
        int answer2 = scan.nextInt();
        int algebra2;
        boolean hasSolution = false;

        for (int i = -10; i <= 10; i++) {
            for (int j = -10; j <= 10; j++) {
                algebra = (ax * i) + (by * j);
                algebra2 = (cx * i) + (dy * j);
                if (algebra == answer && algebra2 == answer2) {
                    hasSolution = true;
                    break;
                }

            }
        }



    }
}