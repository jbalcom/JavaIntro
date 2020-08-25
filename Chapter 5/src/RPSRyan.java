import java.util.Random;
import java.util.Scanner;

public class RPSRyan {

    int playerGesture, cpuGesture;

    Scanner scan = new Scanner(System.in);

    public RPSRyan() {
        this.playerGesture = 0;
        this.cpuGesture = 0;
    }

    public int getCpuGesture() {
        return cpuGesture;
    }

    public int getPlayerGesture() {
        return playerGesture;
    }

    public void setCpuGesture() {
        Random rand = new Random();
        this.cpuGesture = rand.nextInt(3) +1;
    }

    public void setPlayerGesture(int playerGesture) {
        this.playerGesture = playerGesture;
    }

    public String CheckResult(){
        if  ((this.getPlayerGesture() == 1 && this.getCpuGesture() == 1) || (this.getPlayerGesture() == 2 && this.getCpuGesture() == 2) || (this.getPlayerGesture() == 3 && this.getCpuGesture() == 3)){
            return "T";
        } else if ((this.getPlayerGesture() == 2 && this.getCpuGesture() == 3) || (this.getPlayerGesture() == 1 && this.getCpuGesture() == 2) || (this.getPlayerGesture() == 3 && this.getCpuGesture() == 1)){
            return "L";
        } else if ((this.getPlayerGesture() == 3 && this.getCpuGesture() == 2) || (this.getPlayerGesture() == 1 && this.getCpuGesture() == 3) || (this.getPlayerGesture() == 2 && this.getCpuGesture() == 1)){
            return "W";
        } else
            return "E";
    }

    public static boolean checkContinue(){
        Scanner scan = new Scanner(System.in);
        String answer;
        System.out.println();
        System.out.println("Would you like to continue? (Y/N)");
        answer = scan.nextLine();
        if (answer.equalsIgnoreCase("Y"))
            return true;
        else
            return false;
    }

    public String toString(){
        String player;
        String cpu;
        if (this.getCpuGesture() == 1)
            cpu = "Rock";
        else if (this.getCpuGesture() == 2)
            cpu = "Paper";
        else
            cpu = "Scissor";
        if (this.getPlayerGesture() == 1)
            player = "Rock";
        else if (this.getPlayerGesture() == 2)
            player = "Paper";
        else
            player = "Scissor";

        return "The player threw " + player + " and the cpu threw " + cpu;
    }

    public static void main(String[] args) {
        boolean conProg = true;
        int gesture;
        int cntWin = 0;
        int cntLose = 0;
        int cntTie = 0;
        Scanner scan = new Scanner(System.in);
        RPSRyan game = new RPSRyan();

        while(conProg){
            System.out.println("Hi!  Please play Rock, Paper, Scissor with me!" +
                               " Select a number: 1 - Rock, 2 - Paper, or 3 - Scissors.");
            game.setPlayerGesture(scan.nextInt());
            game.setCpuGesture();
            if (game.CheckResult().equalsIgnoreCase("T")){
                System.out.println(game);
                System.out.println("Congratulations on the tie.");
                cntTie++;
            } else if (game.CheckResult().equalsIgnoreCase("W")){
                System.out.println(game);
                System.out.println("Congratulations on the win.");
                cntWin++;
            } else if (game.CheckResult().equalsIgnoreCase("L")){
                System.out.println(game);
                System.out.println("Congratulations on the lose.");
                cntLose++;
            }
            conProg = RPSRyan.checkContinue();
        }

        System.out.println("You won: " + cntWin  + " times.");
        System.out.println("You lost: " + cntLose + " times.");
        System.out.println("You tied: " + cntTie + " times.");
    }
}
