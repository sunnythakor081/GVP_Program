package TaxCal;

public class AMC extends Tax {
    @Override
    public double waterTax() {
        return 101.2;
    }

    @Override
    public double propertyTax() {
        return 101.3;
    }

    @Override
    public double roadTax() {
        return 101.4;
    }
}
