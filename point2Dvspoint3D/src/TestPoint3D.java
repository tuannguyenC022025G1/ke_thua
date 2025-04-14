public class TestPoint3D {
    public static void main(String[] args) {
        // Create a Point3D object
        Point3D point3D = new Point3D(1.0f, 2.0f, 3.0f);

        // Display the point details using toString()
        System.out.println("Point3D: " + point3D.toString());

        // Test getter and setter methods
        point3D.setX(4.0f);
        point3D.setY(5.0f);
        point3D.setZ(6.0f);
        System.out.println("Updated Point3D: " + point3D.toString());

        // Test setXYZ and getXYZ methods
        point3D.setXYZ(7.0f, 8.0f, 9.0f);
        float[] coordinates3D = point3D.getXYZ();
        System.out.println("Coordinates: (" + coordinates3D[0] + "," + coordinates3D[1] + "," + coordinates3D[2] + ")");
    }
}
