public class Rectangle extends Shape {

    @Override
    public float calculateArea() {
        System.out.print("Enter the length of the rectangle: ");
        float length = scanner.nextFloat();
        System.out.print("Enter the width of the rectangle: ");
        float width = scanner.nextFloat();
        float area = (float) (length * width);
        return area;
    }
}
