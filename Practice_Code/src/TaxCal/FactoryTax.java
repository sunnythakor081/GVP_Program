package TaxCal;

public class FactoryTax {
    public static Tax getTax(String city) {

        return switch (city.toLowerCase()) {
            case "amc" -> new AMC();
            case "vmc" -> new VMC();
            case "smc" -> new SMC();
            default -> null;
        };

    }
}