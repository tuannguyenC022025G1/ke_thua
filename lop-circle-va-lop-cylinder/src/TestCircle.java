public class TestCircle {
    public static void main(String[] args) {
        // Create a circle object
        Circle circle = new Circle(5.0, "Red");

        // Display the circle details using toString()
        System.out.println(circle.toString());

        // Test getter and setter methods
        circle.setRadius(7.0);
        circle.setColor("Blue");

        System.out.println("Updated circle: " + circle.toString());
    }
}
