public class Triangle extends Shape {

    @Override
    public float calculateArea() {
        System.out.print("Enter the base of the triangle: ");
        float base = scanner.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height = scanner.nextFloat();
        float area = (float) (0.5 * base * height);
        return area;
    }
}