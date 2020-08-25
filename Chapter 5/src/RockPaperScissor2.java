import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor2 {

    int ctrWin, ctrLoss, ctrTie;

    Scanner scan = new Scanner(System.in);

    public RockPaperScissor2() {
        this.ctrWin = 0;
        this.ctrLoss = 0;
        this.ctrTie = 0;
    }

    public int getCtrWin() {
        return ctrWin;
    }

    public int getCtrLoss() {
        return ctrLoss;
    }

    public int getCtrTie() {
        return ctrTie;
    }

    public void setCtrWin(int ctrWin) {
        this.ctrWin = ctrWin;
    }

    public void setCtrLoss(int ctrLoss) {
        this.ctrLoss = ctrLoss;
    }

    public void setCtrTie(int ctrTie) {
        this.ctrTie = ctrTie;
    }

    public void PlayRSP() {
        int nbr1 = 0;
        int randoPlay = 0;
        boolean play = true;

        System.out.println("Hi!  Please play Rock, Paper, Scissor with me!  Select a number: 1 - Rock, 2 - Paper, or 3 - Scissors.");
        nbr1 = scan.nextInt();

        while (play) {
            Random generator = new Random();
            randoPlay = 1 + generator.nextInt(3);
            if (nbr1 == 1 && randoPlay == 1) {
                System.out.println("You and the computer both threw out rock.  Tied game!");
                ++ctrTie;
            } else if (nbr1 == 1 && randoPlay == 2) {
                System.out.println("You threw out rock but the computer threw out paper.  Paper beats rock, you lose!");
                ++ctrLoss;
            } else if (nbr1 == 1 && randoPlay == 3) {
                System.out.println("You threw out rock but the computer threw out scissors.  Rock beats scissors, you win!");
                ++ctrWin;
            } else if (nbr1 == 2 && randoPlay == 1) {
                System.out.println("You threw out paper and the computer threw out rock.  Paper beats rock, you win!");
                ++ctrWin;
            } else if (nbr1 == 2 && randoPlay == 2) {
                System.out.println("You and the computer both threw out paper.  Tied game!");
                ++ctrTie;
            } else if (nbr1 == 2 && randoPlay == 3) {
                System.out.println("You threw out paper and the computer threw out Scissors.  Scissors beat paper, you lose!");
                ++ctrLoss;
            } else if (nbr1 == 3 && randoPlay == 1) {
                System.out.println("You threw out scissors and the computer threw out rock.  Scissors beat rock, you lose!");
                ++ctrWin;
            } else if (nbr1 == 3 && randoPlay == 2) {
                System.out.println("You threw out scissors and the computer threw out paper.  Scissors beat paper, you win!");
                ++ctrWin;
            } else if (nbr1 == 3 && randoPlay == 3) {
                System.out.println("You and the computer both threw out scissors.  Tied game!");
                ++ctrTie;
            }
            randoPlay = 1 + generator.nextInt(3);
            System.out.println("To continue select a number: 1 for Rock, 2 for Paper, or 3 for Scissor (to end game, enter 0): ");
            nbr1 = scan.nextInt();
            if (nbr1 == 0) {
                play = false;
            }
        }
    }
}
