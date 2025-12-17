package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter car name");
        String carname = sc.next();

        Createcar obj = Carfactory.getcar(carname);


        System.out.println(obj.color());
        System.out.println(obj.year());
        System.out.println(obj.speed());

    }
}
