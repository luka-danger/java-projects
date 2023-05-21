//Drink Menu Program (Menu in Polish)

import java.util.Scanner;

public class drinkOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dzien dobry. Co chcesz do picia?");
        System.out.println("1) Woda 2) Kawa 3) Herbata 4) Piwo");
        System.out.println("Wybierz numer: ");
        int drinkResponse = input.nextInt();
        //Assign default option for drinkDetails
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
            //Any selection besides 1 or 2 selects Niegazowana (Regular water)
            else {
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
            //Any selection besides 1 or 2 selects Czarna (Black coffee)
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
            //Any selection besides 1 or 2 selects Zielona Herbata
            else {
                drinkDetails += "Zielona Herbata";
                System.out.println(drinkDetails);
            }
        }
        else if(drinkResponse == 4) {
            drinkDetails = "Piwo";
            System.out.println("Ktore piwo: 1) Zywiec 2) Tyskie 3) Okocim");
            drinkResponse = input.nextInt();
            if(drinkResponse == 1) {
                drinkDetails += ", Zywiec";
                System.out.println(drinkDetails + ". Na Zdrowie");
            }
            else if(drinkResponse == 2) {
                drinkDetails += ", Tyskie";
                System.out.println(drinkDetails + ". Na Zdrowie");
            }
            else if(drinkResponse == 3) {
                drinkDetails += ", Okocim";
                System.out.println(drinkDetails + ". Na Zdrowie");
            }
            //Any selection besides 1, 2, or 3 selects Piwo Sezonowe
            else {
                drinkDetails += " Sezonowe";
                System.out.println(drinkDetails + ". Na Zdrowie");
            }
        }
        /*Any selection besides 1, 2, 3, or 4 leaves drinkDetails as
        "Nie zamówiłeś napoju" (You didn't order a drink") */
        else {
            System.out.println(drinkDetails);
        }
    }
}
