import java.util.*;

public class NameRando1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        String firstName, lastName;

        System.out.println("What is your first name?" );
        firstName = scan.nextLine();
        System.out.println("What is your last name? ");
        lastName = scan.nextLine();

        System.out.println(firstName.substring(0,1) + lastName.substring(0,5) + (generator.nextInt(90) + 10));
    }
}
