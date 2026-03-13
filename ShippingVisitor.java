import java.util.HashMap;

public interface ShippingVisitor {
    double visitChair(Chair chair, HashMap<String, Double> data);
    double visitTable(Table table, HashMap<String, Double> data);
    double visitSofa(Sofa sofa, HashMap<String, Double> data);
}