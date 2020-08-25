import java.util.Scanner;

public class HiLowTester {
    public static void main(String[] args) {
        HiLow2 game = new HiLow2();
        boolean status = true;
        int nbr1 = 0;

        Scanner scan = new Scanner(System.in);

        game.setRandoNbr();
        System.out.println("What number am I thinking? ");
        nbr1 = scan.nextInt();

        while (status){
            if (nbr1 == game.getRandoNbr()){
                System.out.println("You have guess the number correctly!");
                status = false;
            }
            else if (nbr1 > game.getRandoNbr()) {
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
