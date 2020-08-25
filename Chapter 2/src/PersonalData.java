import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            String name, college, pet;
            int age;

            System.out.println("What is your name?");
            name = scan.nextLine();

            System.out.println("How old are you?");
            age = scan.nextInt();
            scan.nextLine();
            System.out.println("What is the name of your College?");
            college = scan.nextLine();

            System.out.println("What is your pet's name?");
            pet = scan.nextLine();

            System.out.println("Hello, my name is " + name + " and I am " + age + " years ");
            System.out.println("old.  I'm enjoying my time at " + college + ", though I ");
            System.out.println("miss my pet " + pet + " very much!");


    }
}
