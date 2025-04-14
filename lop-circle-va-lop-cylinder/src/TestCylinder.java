public class TestCylinder {
    public static void main(String[] args) {
        // Create a cylinder object
        Cylinder cylinder = new Cylinder(5.0, "Green", 10.0);

        // Display the cylinder details using toString()
        System.out.println(cylinder.toString());

        // Test getter and setter methods
        cylinder.setHeight(12.0);
        System.out.println("Updated cylinder: " + cylinder.toString());
    }
}
