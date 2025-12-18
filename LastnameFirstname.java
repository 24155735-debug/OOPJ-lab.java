import java.util.Scanner;
public class LastnameFirstname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name: ");
        String firstname = sc.nextLine();
        System.out.println("Enter Last name: ");
        String lastname = sc.nextLine();
        System.out.println("New Name: " + lastname + "" + firstname);
        sc.close();
    }
}