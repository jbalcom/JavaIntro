public class FlipRace {
    public static void main(String[] args) {
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        int coin1Ctr = 0;
        int coin2Ctr = 0;
        int coin1HeadInRow = 0;
        int coin2HeadInRow = 0;
        boolean status = false;

        while (!status) {
            coin1.flip();
            coin2.flip();
            coin1Ctr++;
            coin2Ctr++;
            System.out.println(coin1);
            System.out.println(coin2);
            if (coin1.isHeads() && coin2.isHeads()) {
                coin1HeadInRow++;
                coin2HeadInRow++;
            }
            else if (coin1.isHeads()){
                coin1HeadInRow++;
                coin2HeadInRow = 0;
            }
            else if (coin2.isHeads()) {
                coin2HeadInRow++;
                coin1HeadInRow = 0;
            }
            else {
                coin1HeadInRow = 0;
                coin2HeadInRow = 0;
            }
            if (coin1HeadInRow == 3 && coin2HeadInRow == 3)
            {
                System.out.println("Coin 1 and Coin 2 have tied with 3 heads flipped in a row.  It took coin1 " + coin1Ctr + " flips and took coin 2 " + coin2Ctr + " flips.");
                status = true;
            }
            else if (coin1HeadInRow == 3)
            {
                System.out.println("Coin 1 won the flip race.  It took " + coin1Ctr + " flips.");
                status = true;
            }
            else if (coin2HeadInRow == 3)
            {
                System.out.println("Coin 2 won the flip race.  It took " + coin2Ctr + " flips.");
                status = true;
            }
        }
    }
}