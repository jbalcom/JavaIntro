import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextEquality {
    public static void main(String[] args) throws IOException {
        String txt1;
        String txt2;
        int lineCnt = 0;
        Scanner fileScan1, fileScan2;
        fileScan1 = new Scanner(new File("FileNumeroUno.txt"));
        fileScan2 = new Scanner(new File("FileNumeroDos.txt"));


        while (fileScan1.hasNext() && fileScan2.hasNext()) {
            txt1 = fileScan1.nextLine();
            txt2 = fileScan2.nextLine();
            if (!txt1.equalsIgnoreCase(txt2)) {
                System.out.println("On line " + lineCnt + ", file 1's line is " + txt1 + ", but file 2's line is " + txt2 + ".");
            }
            lineCnt++;
        }
    }
}

