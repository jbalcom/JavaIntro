public class RPSTesting {
    public static void main(String[] args) {

        RockPaperScissor2 game = new RockPaperScissor2();
        game.PlayRSP();
        System.out.println("You won: " + game.ctrWin  + " times.");
        System.out.println("You lost: " + game.ctrLoss + " times.");
        System.out.println("You tied: " + game.ctrTie + " times.");
    }
}
