import java.util.HashMap;

public class Table implements Furniture {
    private double weight;

    public Table(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(ShippingVisitor visitor, HashMap<String, Double> data) {
        return visitor.visitTable(this, data);
    }
}