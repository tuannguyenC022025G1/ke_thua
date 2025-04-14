import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập độ dài các cạnh
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double side1 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double side2 = scanner.nextDouble();

        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double side3 = scanner.nextDouble();

        // Nhập màu sắc
        System.out.print("Nhập màu sắc của tam giác: ");
        scanner.nextLine(); // Xóa bộ đệm
        String color = scanner.nextLine();

        // Tạo đối tượng Triangle
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(true);

        // Kiểm tra xem có phải tam giác hợp lệ
        if (isValidTriangle(side1, side2, side3)) {
            // In thông tin
            System.out.println("\nThông tin tam giác:");
            System.out.println(triangle.toString());
            System.out.printf("Diện tích: %.2f%n", triangle.getArea());
            System.out.printf("Chu vi: %.2f%n", triangle.getPerimeter());
            System.out.println("Màu sắc: " + triangle.getColor());
        } else {
            System.out.println("Ba cạnh nhập vào không tạo thành một tam giác hợp lệ!");
        }

        scanner.close();
    }

    // Kiểm tra tam giác hợp lệ
    private static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) &&
                (side2 + side3 > side1) &&
                (side1 + side3 > side2) &&
                side1 > 0 && side2 > 0 && side3 > 0;
    }
}