package Strategy;

import Proxy.P;

public class Client {
    public static void main(String[] args) {

        Snak cobra = new Cobra();
        Snak python = new Python();

        System.out.println(cobra.display());
//        cobra.setbehviyar(new Nonpoisonous());
        System.out.println(cobra.behviyar());


    }
}
