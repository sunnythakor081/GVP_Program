package Proxy_Design_Pattern;

public class Client {
    public static void main(String[] args) {
        Subject admin = new Proxy("Admin");
        Subject user = new Proxy("User");

        admin.doWrite();
        admin.doModify();
        admin.doRead();

        System.out.println("-----------------------------------");

        user.doRead();
        user.doWrite();
        user.doModify();

    }
}
