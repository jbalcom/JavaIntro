public class Kennel {
    public static void main(String[] args){
        Dog dog1 = new Dog("Tiger", 3);
        Dog dog2 = new Dog("Butch", 10);
        Dog dog3 = new Dog("Princess", 6);

        dog1.dogAge();
        dog2.dogAge();
        dog3.dogAge();

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
