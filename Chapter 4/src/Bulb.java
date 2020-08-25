public class Bulb {

    private String status;

    public Bulb(String state) {
        this.status = state;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    String getStatus() {
        return status;
    }
    public String toString(){
        return "The bulb is turned " + getStatus() + ".";
    }
}
