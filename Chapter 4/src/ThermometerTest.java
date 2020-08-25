public class ThermometerTest {
    public static void main(String []args)    {
        Thermometer temp1 = new Thermometer(55.3);
        Thermometer temp2 = new Thermometer();

        System.out.println(temp1.getTemperature());
        System.out.println(temp2.getTemperature());

        temp1.increaseTemp();
        temp2.increaseTemp();

        System.out.println(temp1);
        System.out.println(temp2);

        temp1.resetTemperature();
        temp2.resetTemperature();

        System.out.println(temp1);
        System.out.println(temp2);
    }
}

