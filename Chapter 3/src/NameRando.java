import java.util.Scanner;
import java.util.Random;

public class NameRando {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        int num1;
        String firstName, lastName, firstInit, lastInit;

        System.out.println("What is your first name?" );
        firstName = scan.nextLine();
        System.out.println("What is your last name? ");
        lastName = scan.nextLine();

        firstInit = firstName.substring(0,1);
        lastInit = lastName.substring(0,5);

        num1 = generator.nextInt(90) + 10;

        System.out.println(firstInit + lastInit + num1);
    }
}
