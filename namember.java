import java.util.Scanner;
public class namember {
    public static void main(String[] args) {

        String firstName;
        String lastName;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name and last name");
        firstName = sc.next();
        lastName = sc.next();
        System.out.println(lastName + " " + firstName);
    }
}