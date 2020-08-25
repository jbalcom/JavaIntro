import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Random generator = new Random();
        Scanner scan = new Scanner(System.in);

        int randoSign;
        int nbr1 = 0;
        int ctrWin = 0;
        int ctrLose = 0;
        int ctrTie = 0;

        randoSign = 1 + generator.nextInt(3);

        System.out.println("Hello.  Play Rock, Paper, Scissor with me! Please select a number: 1 for Rock, 2 for Paper, or 3 for Scissor (to end game, enter -1): ");
        nbr1 = scan.nextInt();

        while (nbr1 != -1) {
            if (nbr1 == 1 && randoSign == 1) {
                System.out.println("You and the computer both threw out rock.  Tied game!");
                ++ctrTie;
            } else if (nbr1 == 1 && randoSign == 2) {
                System.out.println("You threw out rock but the computer threw out paper.  Paper beats rock, you lose!");
                ++ctrLose;
            } else if (nbr1 == 1 && randoSign == 3) {
                System.out.println("You threw out rock but the computer threw out scissors.  Rock beats scissors, you win!");
                ++ctrWin;
            } else if (nbr1 == 2 && randoSign == 1) {
                System.out.println("You threw out paper and the computer threw out rock.  Paper beats rock, you win!");
                ++ctrWin;
            } else if (nbr1 == 2 && randoSign == 2) {
                System.out.println("You and the computer both threw out paper.  Tied game!");
                ++ctrTie;
            } else if (nbr1 == 2 && randoSign == 3) {
                System.out.println("You threw out paper and the computer threw out Scissors.  Scissors beat paper, you lose!");
                ++ctrLose;
            } else if (nbr1 == 3 && randoSign == 1) {
                System.out.println("You threw out scissors and the computer threw out rock.  Scissors beat rock, you lose!");
                ++ctrWin;
            } else if (nbr1 == 3 && randoSign == 2) {
                System.out.println("You threw out scissors and the computer threw out paper.  Scissors beat paper, you win!");
                ++ctrWin;
            } else if (nbr1 == 3 && randoSign == 3) {
                System.out.println("You and the computer both threw out scissors.  Tied game!");
                ++ctrTie;
            }
            randoSign = 1 + generator.nextInt(3);
            System.out.println("To continue select a number: 1 for Rock, 2 for Paper, or 3 for Scissor (to end game, enter -1): ");
            nbr1 = scan.nextInt();
        }
        System.out.println("You won: " + ctrWin + " times.");
        System.out.println("You lost: " + ctrLose + " times.");
        System.out.println("You tied: " + ctrTie + " times.");
    }
}


