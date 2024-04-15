public class Circle extends Shape {

    @Override
    public float calculateArea() {
        System.out.print("Enter the radius of the circle: ");
        float radius = scanner.nextFloat();
        float area = (float) (Math.PI * radius * radius);
        return area;
    }
}