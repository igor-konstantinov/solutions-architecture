public class Main {
    public static void main(String[] args) {
        // Part 1
        Dog dog = new Dog();
        dog.move();
        dog.speak();

        // Part 2
        Square square = new Square();
        System.out.println(square.calculateArea(2.0));

        Circle circle = new Circle();
        System.out.println(circle.calculateArea(3.0));
    }
}