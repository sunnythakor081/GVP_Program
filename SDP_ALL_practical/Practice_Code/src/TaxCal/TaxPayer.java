package TaxCal;

import java.util.Scanner;

public class TaxPayer {
    public static void main(String[] args) {
        //Tax taxObj;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter City: [amc,vmc,smc]");
            String city = sc.next();
            Tax taxObj = FactoryTax.getTax(city);
            if(taxObj==null){
                throw new Exception("Not Valid City");
            }
            System.out.println("Enter Tax Want To Know: [watertax,propertytax,roadtax]");
            String taxName = sc.next();
            switch (taxName) {
                case "watertax":
                    System.out.println(taxObj.waterTax());
                    break;
                case "roadtax":
                    System.out.println(taxObj.roadTax());
                    break;
                case "propertytax":
                    System.out.println(taxObj.propertyTax());
                default:
                    throw new Exception("Not Valid Tax");
            }

            System.out.println("Want To Pay Right Now?  [y/n]");
            String ch = sc.next();
            if(ch.equalsIgnoreCase("y")){
                System.out.println(taxObj.payment());
            } else if (ch.equalsIgnoreCase("n")) {
                System.out.println("Thank You For Visiting..");
            }else {
                throw new Exception("Choice not valid");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
