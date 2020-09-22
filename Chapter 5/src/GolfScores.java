import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfScores {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> scores = new ArrayList<Integer>();

        int tempScore = 0;
        int index = 0;

        String txt;
        Scanner fileScan, txtScan;
        fileScan = new Scanner(new File("GolfScores.txt"));

        while (index <= 5){
            scores.add(0);
            index++;
        }

        while (fileScan.hasNext()) {
            txt = fileScan.nextLine();
            System.out.println("Txt Info: " + txt);

            txtScan = new Scanner(txt);
            txtScan.useDelimiter("/");

            index = 0;
            while (txtScan.hasNext()) {
                scores.set(index, scores.get(index) + txtScan.nextInt());
                index++;
            }
        }
        System.out.println("Total par is " + scores.get(0) + ".");
        System.out.println("Total score for player1 is " + scores.get(1) + ".");
        System.out.println("Total score for player2 is " + scores.get(2) + ".");
        System.out.println("Total score for player3 is " + scores.get(3) + ".");
        System.out.println("Total score for player4 is " + scores.get(4) + ".");

        System.out.println();

        if ((scores.get(1) < scores.get(2)) && (scores.get(1) < scores.get(3)) && (scores.get(1) < scores.get(4)))
            System.out.println("Player1 wins with a score of " + scores.get(1) + ".");
        else if ((scores.get(2) < scores.get(1)) && (scores.get(2) < scores.get(3)) && (scores.get(2) < scores.get(4)))
            System.out.println("Player2 wins with a score of " + scores.get(2) + ".");
        else if ((scores.get(3) < scores.get(2)) && (scores.get(3) < scores.get(1)) && (scores.get(3) < scores.get(4)))
            System.out.println("Player3 wins with a score of " + scores.get(3) + ".");
        else
            System.out.println("Player4 wins with a score of " + scores.get(4) + ".");

    }
}
