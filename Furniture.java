import java.util.HashMap;

public interface Furniture {
    double accept(ShippingVisitor visitor, HashMap<String, Double> data);
}