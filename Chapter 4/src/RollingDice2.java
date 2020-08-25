public class RollingDice2 {
    public static void main(String[] args) {
        PairOfDice dice = new PairOfDice();

        dice.rollDice();

        System.out.println(dice.getDie1());
        System.out.println(dice.getDie2());
        System.out.println(dice);
    }
}