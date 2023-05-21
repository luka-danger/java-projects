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
        int drinkResponse = input.nextInt();
        String drinkDetails = "Nie zamówiłeś napoju";
        //Provide options depending on the drink selection
        if(drinkResponse == 1) {
            drinkDetails = "Woda";
            System.out.println("Czy wolisz: 1) Gazowana 2) Niegazowana");
            input.nextInt();
            drinkResponse = input.nextInt();
            if(drinkResponse == 1) {
                drinkDetails += " Gazowana";
                System.out.println(drinkDetails);
            }
            else if(drinkResponse == 2) {
                drinkDetails += " Niegazowana";
                System.out.println(drinkDetails);
            }
;       }
        else {
            System.out.println(drinkDetails);
        }
    }
}
