import java.util.Random;
import java.util.Scanner;

public class Slots {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        String answer;
        int nbr1 = 0;
        int nbr2 = 0;
        int nbr3 = 0;
        Boolean status = true;

        System.out.println("Want to try your luck? (Y - if yes, N - if no)");
        answer = scan.next();

        while (status) {
            System.out.println("Good Luck!!");
            nbr1 = 0 + generator.nextInt(9);
            nbr2 = 0 + generator.nextInt(9);
            nbr3 = 0 + generator.nextInt(9);
            System.out.println("Your numbers are: " + nbr1 + nbr2 + nbr3);
            if ((nbr1 == nbr2) && (nbr2 == nbr3))
                System.out.println("You have matched all three numbers.  YOU WIN!!!");
            else if ((nbr1 == nbr2) || (nbr1 == nbr3) || (nbr2 == nbr3))
                System.out.println("Two numbers match, but sorry not a winner.");
            else
                System.out.println("Sorry no match.");
            System.out.println("Keep playing? (Y - if yes, N - if no)");
            answer = scan.next();
            if (answer.equals("N"))
                status = false;
        }
    }
}
