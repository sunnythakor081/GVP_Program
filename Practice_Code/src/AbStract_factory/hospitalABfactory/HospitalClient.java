package AbStract_factory.hospitalABfactory;

import java.util.Scanner;

public class HospitalClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter hospital");
        String hospitalname = sc.next();

        System.out.println("enter department");
        String departmentname = sc.next();

        String result;

        HospitalFactory hospitalFactory = HospitalFactory.gethospital(hospitalname);

        switch (departmentname.toLowerCase()){
            case "cardio":
                Cardiology cardiology = hospitalFactory.getCardiology();
                result = cardiology.createCardiology();
                break;

            case "neuro":
                Neurology neurology = hospitalFactory.getNeurology();
                result = neurology.createNeurology();
                break;

            default:
                result = "invalide departmentname";

        }

        System.out.println(result);
    }
}
