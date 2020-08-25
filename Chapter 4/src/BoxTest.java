public class BoxTest {
    public static void main(String[] args) {
        Box box1 = new Box(2.8,4.9,6.4);
        Box box2 = new Box(2.3, 3.5, 8.2);
        Box box3 = new Box(1.5, 1.5, 1.5);

        System.out.println("Box 1 is " + box1.isFull() + " which means empty.");
        System.out.println("Box 2 is " + box2.isFull() + " which means empty.");
        System.out.println("Box 3 is " + box3.isFull() + " which means empty.");

        box3.setFull(true);

        System.out.println();
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        box1.setFull(true);
        box2.setFull(true);
        box3.setFull(false);

        System.out.println();
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

    }
}
