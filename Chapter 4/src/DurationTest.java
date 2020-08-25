public class DurationTest {
    public static void main(String[] args){
        Duration time1 = new Duration(5, 55, 22, 35);
        Duration time2 = new Duration(1, 43,15, 25 );

        System.out.println(time1);
        System.out.println(time2);

        System.out.println("The duration in minutes is " + time1.getlength() + " minutes.");
        System.out.println("The duration in minutes is " + time2.getlength() + " minutes.");
    }
}
