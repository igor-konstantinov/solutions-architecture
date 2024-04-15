public class Main {
    public static void main(String[] args) {
        // Part 1
        Triangle triangle = new Triangle();
        System.out.println("The area is: " + triangle.calculateArea());
        // Part 2
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println("The area is: " + shapeCalculator.calculateCircleArea());
    }
}