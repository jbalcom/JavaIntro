import java.util.*;

public class FloatingNbr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        double nbr1;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Enter in a floating decimal number: ");
        nbr1 = scan.nextFloat();

        num1 = (int) Math.floor(nbr1);
        num2 = num1 + 1;

        System.out.println("The closest whole numbers are: " + num1 + " and " + num2);
    }
}