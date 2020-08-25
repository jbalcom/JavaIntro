import java.util.*;

public class HiLow {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        int nbrRando;
        Boolean status = true;
        int nbr1 = 0;

        nbrRando = 1 + generator.nextInt(100);

        System.out.println("What number am I thinking? ");
        nbr1 = scan.nextInt();

        while (status){
            if (nbr1 == nbrRando) {
                System.out.println("You have guess the number correctly!");
                status = false;
            }
            else if (nbr1 > nbrRando) {
                System.out.println("Your guess is higher than the number I am thinking.  Try again.");
                nbr1 = scan.nextInt();
            }
            else {
                System.out.println("Your guess is lower than the number I am thinking.  Try again.");
                nbr1 = scan.nextInt();
            }
        }
    }
}