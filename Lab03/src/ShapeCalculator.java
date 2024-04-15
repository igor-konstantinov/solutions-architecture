import java.util.Scanner;

public class ShapeCalculator {
    Scanner scanner = new Scanner(System.in);
    public float calculateCircleArea(){
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        float area = (float) (Math.PI * radius * radius);
        return area;
    }
    public float calculateRectangleArea() {
        System.out.print("Enter the length of the rectangle: ");
        float length = scanner.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();
        float area = (float) (length * width);
        return area;
    }
    public float calculateTriangleArea() {
        System.out.print("Enter the base of the triangle: ");
        float base = scanner.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = scanner.nextFloat();
        float area = (float) (0.5 * base * height);
        return area;
    }
}
