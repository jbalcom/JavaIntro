public class Box {
    private double height, width, depth;
    private boolean full;

    public Box(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.full = false;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getDepth() {
        return depth;
    }
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public boolean isFull() {
        return full;
    }
    public void setFull(boolean full) {
        this.full = full;
    }
    public String toString(){
        return "The box's dimensions are " + height + " by " + width + " by " + depth + " and is " + full;
    }
}