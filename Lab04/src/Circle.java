public class Circle implements Shape {

    @Override
    public double calculateArea(Double parameter) {

        return Math.PI * Math.pow(parameter, parameter);
    }
}
