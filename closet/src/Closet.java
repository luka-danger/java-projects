import java.util.HashSet;
import java.util.Scanner;

public class Closet {
    public static void main(String[] args) {
        Scanner response = new Scanner(System.in);
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
        else {
            System.out.println("The closet does not contain " + searchCloset);
        }
    }
}
