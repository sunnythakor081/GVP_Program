package Facad;

import java.util.Scanner;

public class FacadePatternClient {


    public static void main(String[] args) {


        ShopKeeper shopKeeper = new ShopKeeper();
        Scanner sc = new Scanner(System.in);


        while (true){

            System.out.println("\nWelcome to the Mobile Shop!");
            System.out.println("1. Buy iPhone");
            System.out.println("2. Buy Samsung");
            System.out.println("3. Buy Google Pixel");
            System.out.print("Enter your choice: ");

            int choise = sc.nextInt();

            switch (choise){

                case 1:
                    shopKeeper.iphonesale();
                    break;

                case 2:
                    shopKeeper.samsungsale();
                    break;

                case 3:
                    shopKeeper.google_pixelsale();

                default:
                    System.out.println("Invalide choice");

            }
        }


    }
}
