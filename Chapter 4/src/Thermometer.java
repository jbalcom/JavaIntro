public class Thermometer {

    private double temperature;

    public Thermometer(double temperature) {
        this.temperature = temperature;
    }
    public Thermometer(){
        temperature = 37.0;
    }
    public void increaseTemp(){
        temperature = temperature + .01;
    }
    public double getTemperature(){
        return temperature;
    }
    public String toString() {
        return "The current temperature is " + temperature;
    }
    public void resetTemperature(){
      temperature = 37.0;
    }
}
