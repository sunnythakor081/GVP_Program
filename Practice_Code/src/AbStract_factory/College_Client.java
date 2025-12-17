package AbStract_factory;

import java.util.Scanner;

public class College_Client {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String result;
        System.out.println("Enter Collge Name:");
        String collegeName = sc.next();

        System.out.println("Enter your department:");
        String depart = sc.next();


        CollegeFactory obj = CollegeFactory.getCollegename(collegeName);


        switch (depart.toUpperCase()){
            case "MCA":
                Mca mc = obj.getMca();
                result = mc.createMca();
                break;

            case "BCA":
                Bca bc = obj.getBca();
                result = bc.createBca();
                break;

            case "PGDCA":

                Pgdca pg = obj.getpgdca();
                result = pg.createpgdca();
                break;

            default:
              result = "invalid department Nmae";


        }
        System.out.println(result);
    }

}
