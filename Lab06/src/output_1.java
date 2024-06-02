import java.util.List;

public class output_1 {
    public double calculateTotalPrice(List<Double> productPrices, Boolean discount) {
        double totalPrice = 0;
        for (double price : productPrices) {
            if (discount) {
                totalPrice += price * 0.9;
            } else {
                totalPrice += price;
            }
        }
        return totalPrice;
    }
    public double calculateTotalPriceWithTax(List<Double> productPrices, Boolean discount, Double taxRate) {
        double totalPrice = calculateTotalPrice(productPrices, discount);
        totalPrice *= (1 + taxRate);
        return totalPrice;
    }
}