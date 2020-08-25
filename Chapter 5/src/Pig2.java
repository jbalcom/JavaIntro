import java.util.Scanner;

public class Pig2 {
    int playerAccumScore;
    int computerAccumScore;

    public Pig2() {
        this.playerAccumScore = 0;
        this.computerAccumScore = 0;
    }

    public Pig2(int a, int b) {
        playerAccumScore = a;
        computerAccumScore = b;
    }

    public Pig2(int a) {
        playerAccumScore = a;
        this.computerAccumScore = 0;
    }

    public int getComputerAccumScore() {
        return computerAccumScore;
    }

    public int getPlayerAccumScore() {
        return playerAccumScore;
    }

    public void setComputerAccumScore(int cpuScore) {
        this.computerAccumScore = cpuScore;
    }

    public void setPlayerAccumScore(int playerScore) {
        this.playerAccumScore = playerScore;
    }

    public void playerturn() {
        PairofDice2 Dice = new PairofDice2();
        Scanner scan = new Scanner(System.in);
        int playerSum = 0;
        boolean playerConTurn = true;
        String answer;
        while (playerConTurn) {
            Dice.rollDice();
            System.out.println("Your 1st die is: " + Dice.getDie1() + ", and your 2nd die is: " + Dice.getDie2());
            if (Dice.getDie1() == 1 && Dice.getDie2() == 1) {
                this.setPlayerAccumScore(0);
                System.out.println("You lose all of your accumulated points.");
                System.out.println("Please pass the dice.");
                System.out.println();
                playerConTurn = false;
            } else if (Dice.getDie1() == 1 || Dice.getDie2() == 1) {
                System.out.println("You lose your accumulated points in this round but still have " + this.getPlayerAccumScore() + " points.");
                System.out.println("Please pass the dice.");
                System.out.println();
                playerConTurn = false;
            } else{
                playerSum += Dice.getSum();
                if ((this.getPlayerAccumScore() + playerSum) < 100){
                    System.out.println("You accumulated " + playerSum + " points this round.");
                    System.out.println("Do you want to push your luck? (Y - to continue or N - pass to computer)");
                    answer = scan.nextLine();
                    if (answer.equalsIgnoreCase("N")) {
                        System.out.println("You have decided to end your turn and are adding " + playerSum + " to your total " + playerAccumScore + " for a total score of " + (playerAccumScore + playerSum) + ".");
                        this.setPlayerAccumScore(this.getPlayerAccumScore() + playerSum);
                        playerConTurn = false;
                    }
                }
            }
        }
    }

    public void computerTurn() {
        PairofDice2 Dice = new PairofDice2();
        boolean computerConTurn =  true;
        int computerSum = 0;
        while (computerConTurn) {
            Dice.rollDice();
            System.out.println("Computer's 1st die is: " + Dice.getDie1() + ", and the 2nd die is: " + Dice.getDie2());
            if (Dice.getDie1() == 1 && Dice.getDie2() == 1) {
                this.setComputerAccumScore(0);
                System.out.println("Computer lost all accumulated points and passed the dice back to you.");
                System.out.println();
                computerConTurn = false;
            } else if (Dice.getDie1() == 1 || Dice.getDie2() == 1) {
                System.out.println("Computer lost the points this round but still have " + this.getComputerAccumScore() + " points.  The dice have been passed back to you.");
                System.out.println();
                computerConTurn = false;
            } else {
                computerSum += Dice.getSum();
                if (computerSum >= 20 || (this.getComputerAccumScore() + computerSum >= 100)) {
                    this.setComputerAccumScore(this.getComputerAccumScore() + computerSum);
                    System.out.println("Computer's points this round are " + computerSum + " for a total score of: " + this.getComputerAccumScore());
                    computerConTurn = false;
                }
            }
        }
    }
}