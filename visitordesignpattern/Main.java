import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Double> shippingData = new HashMap<>();

        shippingData.put("chairFlatRate", 50.0);
        shippingData.put("tableRatePerKg", 10.0);
        shippingData.put("sofaRate", 5.0);
        shippingData.put("distance", 20.0);
        
        Furniture chair = new Chair("Office Chair");
        Furniture table = new Table(15);
        Furniture sofa = new Sofa(3);

        ShippingVisitor calculator = new ShippingCostCalculator();

        double chairCost = chair.accept(calculator, shippingData);
        double tableCost = table.accept(calculator, shippingData);
        double sofaCost = sofa.accept(calculator, shippingData);

        System.out.println("Chair Shipping Cost: " + chairCost);
        System.out.println("Table Shipping Cost: " + tableCost);
        System.out.println("Sofa Shipping Cost: " + sofaCost);
    }
}
