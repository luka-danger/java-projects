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
            drinkResponse = input.nextInt();
            if (drinkResponse == 1) {
                drinkDetails += " Gazowana";
                System.out.println(drinkDetails);
            } else if (drinkResponse == 2) {
                drinkDetails += " Niegazowana";
                System.out.println(drinkDetails);
            }
        }
        else if(drinkResponse == 2) {
            drinkDetails = "Kawa";
            System.out.println("Czy wolisz: 1) Czarna (bez mleka) 2) Z mlekiem owsianym");
            drinkResponse = input.nextInt();
            if(drinkResponse == 1) {
                drinkDetails += ", Czarna (bez mleka)";
                System.out.println(drinkDetails);
            }
            else if(drinkResponse == 2) {
                drinkDetails += " z mlekiem owsianym";
                System.out.println(drinkDetails);
            }
            else {
                drinkDetails += " ,Czarna (bez mleka)";
                System.out.println(drinkDetails);
            }
        }
        else if(drinkResponse == 3) {
            drinkDetails = "Herbata";
            System.out.println("Czy wolisz: 1) Zielona 2) Malinowa");
            drinkResponse = input.nextInt();
            if(drinkResponse == 1) {
                System.out.println("1) Z cytryną 2) Bez cytryny");
                drinkResponse = input.nextInt();
                if(drinkResponse == 1) {
                    drinkDetails += " z cytryną";
                    System.out.println(drinkDetails);
                }
                else if(drinkResponse == 2) {
                    drinkDetails += " bez cytryny";
                    System.out.println(drinkDetails);
                }
            }
            else if(drinkResponse == 2) {
                drinkDetails += " malinowa";
                System.out.println(drinkDetails);
            }
            else {
                drinkDetails += "Zielona Herbata";
                System.out.println(drinkDetails);
            }
        }
        else {
            System.out.println(drinkDetails);
        }
    }
}
