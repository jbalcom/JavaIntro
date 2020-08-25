import java.util.*;
public class RyanHiLowTester {

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        boolean conProg = true;
        int answer;
        RyanHiLow game = new RyanHiLow();
        game.setRightNbr();
        while(conProg){
            System.out.println("Please guess a number");
            answer = scan.nextInt();
            conProg = game.checkAnswer(answer);
        }
    }
}
