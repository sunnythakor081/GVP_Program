package TaxCal;

public abstract class Tax {
    public abstract double waterTax();
    public abstract double propertyTax();
    public abstract double roadTax();

    public String payment(){

        return "Payment Successful";
    }
}
