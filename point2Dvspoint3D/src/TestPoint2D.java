public class TestPoint2D {
    public static void main(String[] args) {
        // Create a Point2D object
        Point2D point = new Point2D(1.0f, 2.0f);

        // Display the point details using toString()
        System.out.println("Point2D: " + point.toString());

        // Test getter and setter methods
        point.setX(3.0f);
        point.setY(4.0f);
        System.out.println("Updated Point2D: " + point.toString());

        // Test setXY and getXY methods
        point.setXY(5.0f, 6.0f);
        float[] coordinates = point.getXY();
        System.out.println("Coordinates: (" + coordinates[0] + "," + coordinates[1] + ")");
    }
}
