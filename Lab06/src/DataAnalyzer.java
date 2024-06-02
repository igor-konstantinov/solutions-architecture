import java.util.Collections;
import java.util.List;

public class DataAnalyzer {
    private List<Double> data;

    public DataAnalyzer(List<Double> data) {
        this.data = data;
    }

    public double calculateTotal() {
        return data.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double calculateAverage() {
        double total = calculateTotal();
        double count = data.size();
        return count != 0 ? total / count : 0;
    }

    public Double calculateMinimum() {
        if (data.isEmpty()) {
            return null;
        }
        return Collections.min(data);
    }

    public Double calculateMaximum() {
        if (data.isEmpty()) {
            return null;
        }
        return Collections.max(data);
    }
}