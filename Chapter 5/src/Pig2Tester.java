import java.util.Scanner;

public class Pig2Tester {

    public static void main(String[] args) {
        String answer;
        Pig2 game = new Pig2();
        int playCtr = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Hi!  Want to play the Pig Game? (Y-yes or N-no)");
        answer = scan.nextLine();
        if (answer.equalsIgnoreCase("N"))
            System.exit(0);

        while (game.getPlayerAccumScore() < 100 && game.getComputerAccumScore() < 100) {
            System.out.println();
            playCtr++;
            System.out.println("Turn: " + playCtr);
            System.out.println("Press enter to roll the dice.");
            scan.nextLine();
            game.playerturn();
            if (game.getPlayerAccumScore() < 100) {
                game.computerTurn();
            }
        }
        if (game.getPlayerAccumScore() >= 100) {
            System.out.println("Congrats, you win with a score of " + game.getPlayerAccumScore() + "!");
        } else if (game.getComputerAccumScore() >= 100) {
            System.out.println("That sucks, the computer beat you with a score of " + game.getComputerAccumScore() + "!");
        }
    }
}
