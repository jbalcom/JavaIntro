public class Lights {
    public static void main(String []args)    {
        Bulb bulb1 = new Bulb("on");
        Bulb bulb2 = new Bulb("off");
        Bulb bulb3 = new Bulb("on");

        System.out.println("The light is turned " + bulb1.getStatus() + ".");
        System.out.println("The light is turned " + bulb2.getStatus() + ".");
        System.out.println("The light is turned " + bulb3.getStatus() + ".");

        bulb1.setStatus("off");
        bulb2.setStatus("on");

        System.out.println("The light is now turned " + bulb1.getStatus() + ".");
        System.out.println("The light is now turned " + bulb2.getStatus() + ".");
        System.out.println("The light is now turned " + bulb3.getStatus() + ".");

    }
}
