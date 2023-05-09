import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        String funny = "Pickle";
        System.out.println(funny.charAt(2));
        String chilling = "I AM EASILY DISTRACTED";
        String school = "i hope I finish school soon";
        String test = "does THIS wOrK";
        String test2 = "hoW abOUT THIS";
        System.out.println(chilling.toLowerCase());
        System.out.println(school.toUpperCase());
        System.out.println(test.toLowerCase());
        System.out.println(test2.toUpperCase());
        Scanner hello = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = hello.nextLine();
        System.out.println("Hello " + name + "! " + chilling.replace("I AM" , "YOU ARE"));
    }
}
