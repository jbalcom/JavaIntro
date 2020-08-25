import java.util.Random;


public class HiLow2 {

    int nbrRando;
    Random generator = new Random();

    public HiLow2(){
    }
    public int getRandoNbr(){
        return nbrRando;
    }
    public void setRandoNbr(){
        this.nbrRando = 1 + generator.nextInt(100);
    }
}
