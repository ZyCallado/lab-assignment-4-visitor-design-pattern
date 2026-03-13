import java.util.HashMap;

public class Chair implements Furniture {
    private String name;

    public Chair(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double accept(ShippingVisitor visitor, HashMap<String, Double> data) {
        return visitor.visitChair(this, data);
    }
}