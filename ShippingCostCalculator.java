import java.util.HashMap;

public class ShippingCostCalculator implements ShippingVisitor {
    
    @Override
    public double visitChair(Chair chair, HashMap<String, Double> data) {

        double flatRate = data.get("chairFlatRate");

        return flatRate;
    }

    @Override
    public double visitTable(Table table, HashMap<String, Double> data) {

        double ratePerKg = data.get("tableRatePerKg");

        return table.getWeight() * ratePerKg;
    }

    @Override
    public double visitSofa(Sofa sofa, HashMap<String, Double> data) {

        double distance = data.get("distance");
        double bulkyRate = data.get("sofaRate");

        return sofa.getSize() * bulkyRate * distance;
    }
}