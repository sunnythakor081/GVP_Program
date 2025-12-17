package Factory_method;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ");
        String employ = sc.next();



        Employ obj = Employfactory.getEmp(employ);
       // assert obj != null;
        System.out.println(obj.salary());
        System.out.println(obj.department());
        System.out.println(obj.name());

    }
}
