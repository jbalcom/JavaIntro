import java.util.Scanner;
public class Pig {
    public static void main(String[] args) {
        PairofDice2 Dice = new PairofDice2();

        int playerSum = 0;
        int computerSum = 0;
        int playerAccumScore = 0;
        int computerAccumScore = 0;
        int playCtr = 0;
        int playerTurnEnd = 0;
        int computerTurnEnd = 0;
        String answer;

        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Hi!  Want to play the Pig Game? (Y-yes or N-no)");
        answer = scan.nextLine();
        if (answer.equalsIgnoreCase("N"))
            System.exit(0);

        while (playerAccumScore < 100 && computerAccumScore < 100) {
            System.out.println();
            playerSum = 0;
            computerSum = 0;
            playCtr++;
            System.out.println("Turn: " + playCtr);
            System.out.println("Press enter to roll the dice.");
            scan.nextLine();
            while (playerSum < 100) {
                playerTurnEnd = 0;
                Dice.rollDice();
                System.out.println("Your 1st die is: " + Dice.getDie1() + ", and your 2nd die is: " + Dice.getDie2());
                if (Dice.getDie1() == 1 && Dice.getDie2() == 1) {
                    playerAccumScore = 0;
                    System.out.println("You lose all of your accumulated points.");
                    System.out.println("Please pass the dice.");
                    System.out.println();
                    break;
                } else if (Dice.getDie1() == 1 || Dice.getDie2() == 1) {
                    playerSum = 0;
                    System.out.println("You lose your accumulated points in this round but still have " + playerAccumScore + " points.");
                    System.out.println("Please pass the dice.");
                    System.out.println();
                    break;
                } else{
                    playerSum += Dice.getSum();
                    if ((playerAccumScore + playerSum) < 100){
                        System.out.println("You accumulated " + playerSum + " points this round.");
                        System.out.println("Do you want to push your luck? (Y - to continue or N - pass to computer)");
                        answer = scan.nextLine();
                        if (answer.equalsIgnoreCase("N")) {
                            System.out.println("You have decided to end your turn and are adding " + playerSum + " to your total " + playerAccumScore + " for a total score of " + (playerAccumScore + playerSum) + ".");
                            playerTurnEnd = 1;
                        }
                    }
                }
                if (playerTurnEnd == 1 || (playerAccumScore + playerSum) >= 100) {
                    System.out.println();
                    playerAccumScore += playerSum;
                    break;
                }
            }
            if (playerAccumScore >= 100) {
                break;
            }
            while (computerSum < 20) {
                computerTurnEnd = 0;
                Dice.rollDice();
                System.out.println("Computer's 1st die is: " + Dice.getDie1() + ", and the 2nd die is: " + Dice.getDie2());
                if (Dice.getDie1() == 1 && Dice.getDie2() == 1) {
                    computerAccumScore = 0;
                    System.out.println("Computer lost all accumulated points and passed the dice back to you.");
                    System.out.println();
                    break;
                } else if (Dice.getDie1() == 1 || Dice.getDie2() == 1) {
                    computerSum = 0;
                    System.out.println("Computer lost the points this round but still have " + computerAccumScore + " points.  The dice have been passed back to you.");
                    System.out.println();
                    break;
                } else {
                    computerSum += Dice.getSum();
                    if (computerSum >= 20) {
                        computerAccumScore += computerSum;
                        System.out.println("Computer's points this round are " + computerSum + " for a total score of: " + computerAccumScore);
                        computerTurnEnd = 1;
                    }
                }
                if (computerTurnEnd == 1 || computerAccumScore >= 100) {
                    System.out.println();
                    break;
                }
            }
        }
        if (playerAccumScore >= 100) {
            System.out.println("Congrats, you win with a score of " + playerAccumScore + "!");
        } else if (computerAccumScore >= 100) {
            System.out.println("That sucks, the computer beat you with a score of " + computerAccumScore + "!");
        }
    }
}

