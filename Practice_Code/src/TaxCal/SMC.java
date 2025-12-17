package TaxCal;

public class SMC extends Tax{
    @Override
    public double waterTax() {
        return 100.1;
    }

    @Override
    public double propertyTax() {
        return 100.2;
    }

    @Override
    public double roadTax() {
        return 100.3;
    }
}
