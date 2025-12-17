package client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre os ");
        String os = sc.next();

        System.out.println("Entre your componnet");
        String compo = sc.next();

        Create_Component obj = AbstractFactory.getcom(os);
        if(compo=="button") {
            System.out.println(obj.button());
        }
        else if(compo=="radio") {
            System.out.println(obj.radio());
        }
        else {
            System.out.println(obj.checkbox());
        }

    }
}
