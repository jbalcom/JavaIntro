import java.util.*;

public class RyanHiLow {
    int rightNbr;

    public RyanHiLow(){
        rightNbr = 0;
    }

    public void setRightNbr() {
        Random rand = new Random();
        rightNbr = rand.nextInt(100) + 1;
    }

    public boolean checkAnswer(int answer){
        if (answer <= 0 || answer >= 101){
            System.out.println("The number must be between 1 - 100 inclusive.  Guess again.");
            return this.checkContinue();}
        else if (answer > this.rightNbr){
            System.out.println("The number is lower.  Guess again.");
            return this.checkContinue();}
        else if (answer < this.rightNbr){
            System.out.println("The number is higher.  Guess again.");
            return this.checkContinue();}
        else {
            System.out.println("Congratulations.  You guess the number.");
            return false;}
    }
    public boolean checkContinue(){
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println("Would you like to guess again (Y/N)");
        answer = scan.nextLine();
        if (answer.equalsIgnoreCase("Y"))
            return true;
        else
            return false;
    }
}
