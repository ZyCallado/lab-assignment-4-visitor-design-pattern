import java.util.HashMap;

public class Sofa implements Furniture {
    private double size;

    public Sofa(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    public double accept(ShippingVisitor visitor, HashMap<String, Double> data) {
        return visitor.visitSofa(this, data);
    }
}
