public class Dog {
    private String name;
    private int age;

    public Dog(String dogName, int dogAge){
        name = dogName;
        age = dogAge;
    }
    public int dogAge(){
        age = 7 * age;
        return age;
    }
    public String toString() {
        return "We have " + name + " who is " + age + " years old in human years.";
    }
}
