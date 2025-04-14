public class Circle {
    private double radius;
    private String color;

    // Constructor
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter and Setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", color=" + color + ", area=" + getArea() + "]";
    }
}
