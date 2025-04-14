public class Main {
    public static void main(String[] args) {
        // Test Point
        System.out.println("Testing Point class:");
        Point point = new Point(1.0f, 2.0f);
        System.out.println("Initial point: " + point);
        point.setXY(3.0f, 4.0f);
        System.out.println("After setXY: " + point);

        // Test MovablePoint
        System.out.println("\nTesting MovablePoint class:");
        MovablePoint movablePoint = new MovablePoint(5.0f, 6.0f, 2.0f, 3.0f);
        System.out.println("Initial movable point: " + movablePoint);
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);
        movablePoint.setSpeed(1.0f, 1.0f);
        movablePoint.move();
        System.out.println("After moving with new speed: " + movablePoint);
    }
}