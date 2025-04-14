public class Point3D extends Point2D {
    private float z;

    // Constructor
    public Point3D(float x, float y, float z) {
        super(x, y); // Call constructor of superclass Point2D
        this.z = z;
    }

    // Getter and Setter for z
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    // Method to set x, y, and z
    public void setXYZ(float x, float y, float z) {
        setXY(x, y); // Set x and y using the setXY method from Point2D
        this.z = z;
    }

    // Method to get x, y, and z as an array
    public float[] getXYZ() {
        float[] coordinates = getXY();
        float[] result = new float[3];
        result[0] = coordinates[0];
        result[1] = coordinates[1];
        result[2] = this.z;
        return result;
    }

    // toString method to display point as "(x,y,z)"
    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
