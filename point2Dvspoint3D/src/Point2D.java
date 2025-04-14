public class Point2D {
    private float x;
    private float y;

    // Constructor
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter for x
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    // Getter and Setter for y
    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Method to get both x and y as an array
    public float[] getXY() {
        return new float[]{x, y};
    }

    // toString method to display point as "(x,y)"
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
