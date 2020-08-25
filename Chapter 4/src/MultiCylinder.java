public class MultiCylinder {

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(2, 7);
        Cylinder cylinder2 = new Cylinder(9, 3);
        Cylinder cylinder3 = new Cylinder(3, 4);


        System.out.println("Cylinder 1's height is " + cylinder1.getHeight() + ", and radius is " + cylinder1.getRadius());
        System.out.println("Cylinder 2's height is " + cylinder2.getHeight() + ", and radius is " + cylinder2.getRadius());
        System.out.println("Cylinder 3's height is " + cylinder3.getHeight() + ", and radius is " + cylinder3.getRadius());

        System.out.println("Cylinder 1's surface area is " + cylinder1.getSurfaceArea());
        System.out.println("Cylinder 1's volume is " + cylinder1.getVolume());

        System.out.println("Cylinder 2's surface area is " + cylinder2.getSurfaceArea());
        System.out.println("Cylinder 2's volume is " + cylinder2.getVolume());

        System.out.println("Cylinder 3's surface area is " + cylinder3.getSurfaceArea());
        System.out.println("Cylinder 3's volume is " + cylinder3.getVolume());
    }
}
