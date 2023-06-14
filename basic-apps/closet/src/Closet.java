import java.util.HashSet;
import java.util.Scanner;

public class Closet {
    public static void main(String[] args) {
        //Secret password to add items to the Hashset
        String secretPassword = "Bananas";
        Scanner response = new Scanner(System.in);
        //Create a Hashset called closet and add standard items
        HashSet<String> closet = new HashSet<>();
        closet.add("Shoes");
        closet.add("Jeans");
        closet.add("Shirts");
        closet.add("Hoodies");
        //Search for items in the closet
        System.out.println("What would you like to look for in the closet?: ");
        String searchCloset = response.nextLine();
        if(closet.contains(searchCloset)) {
            System.out.println("The closet contains " + searchCloset);
        }
        //Add items to closet if password is entered
        else if(searchCloset.contains(secretPassword)) {
            System.out.println("Password Correct! What would you like to add?: ");
            String addItem = response.nextLine();
            closet.add(addItem);
            System.out.println("You have added a " + addItem + " to the closet.");
        }
        else {
            System.out.println("The closet does not contain " + searchCloset);
        }
    }
}
