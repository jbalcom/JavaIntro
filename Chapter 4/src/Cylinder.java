public class Cylinder {
    private double height, radius;
    private double volume, surfaceArea;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }
    public double getSurfaceArea(){
       return surfaceArea = ((2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2)));
    }
    public double getVolume(){
        return volume = Math.PI * Math.pow(radius, 2) * height;
    }
    public double getHeight(){
        return height;
    }
    public double getRadius(){
        return radius;
    }
}
