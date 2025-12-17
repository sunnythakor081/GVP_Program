package TaxCal;

public class VMC extends Tax{
    @Override
    public double waterTax() {
        return 99.1;
    }

    @Override
    public double propertyTax() {
        return 99.2;
    }

    @Override
    public double roadTax() {
        return 99.3;
    }
}
