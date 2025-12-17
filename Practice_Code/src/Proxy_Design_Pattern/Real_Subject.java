package Proxy_Design_Pattern;

public class Real_Subject implements Subject{
    @Override
    public void doWrite() {
        System.out.println("You are writing");
    }

    @Override
    public void doRead() {
        System.out.println("You are reading");
    }

    @Override
    public void doModify() {
        System.out.println("You are modifying");
    }
}
