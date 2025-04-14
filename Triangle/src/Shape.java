public class Shape {
    private String color;
    private boolean filled;

    // Constructor mặc định
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor với tham số
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters và Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }
}