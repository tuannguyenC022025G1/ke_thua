public class Cylinder extends Circle {
    private double height;

    // Constructor
    public Cylinder(double radius, String color, double height) {
        super(radius, color); // Call constructor of superclass Circle
        this.height = height;
    }

    // Getter and Setter for height
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate volume of the cylinder
    public double getVolume() {
        return getArea() * height;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Cylinder [radius=" + getRadius() + ", color=" + getColor() + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
