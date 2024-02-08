import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.println("How many orders would you like to process?: ");
        int numOrders = scnr.nextInt();
        System.out.println(numOrders);

        double totalSales = 0;

        for (int orderNum = 1; orderNum <= numOrders; orderNum++) {
            System.out.println("Enter price per square foot: ");
            double pricePer = scnr.nextDouble();
            System.out.println("Enter room width: ");
            int roomWidth = scnr.nextInt();
            System.out.println("Enter room length: ");
            int roomLength = scnr.nextInt();
            int roomArea = roomWidth * roomLength;

            double laborCost = roomArea * 0.75;
            double carpetCost = (pricePer * roomArea) * 1.2;
            double salesTax = (laborCost + carpetCost) * 0.07;
            double totalCost = laborCost + carpetCost + salesTax;
        }
    }
}