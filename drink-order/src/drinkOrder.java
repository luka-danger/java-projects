/* Drink Menu Program (Menu in Polish)

Napoje:
Woda
    Gazowana
    Niegazowana

Kawa
    Czarna kawa (bez mleka)
    Z mlekiem owsianym

Herbata
    Zielona
        Z cytryną
        Bez cytryny
    Malinowa

Piwo
    Zywiec
    Okocim
    Tyskie
 */

import java.util.Scanner;

public class drinkOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dzien dobry. Co chcesz do picia?");
        System.out.println("1) Woda 2) Kawa 3) Herbata 4) Piwo");
        System.out.println("Wybierz numer: ");
        int drinkTypeResponse = input.nextInt();
        }
    }
}
