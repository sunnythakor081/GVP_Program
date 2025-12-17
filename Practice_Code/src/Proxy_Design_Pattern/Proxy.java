package Proxy_Design_Pattern;

public class Proxy implements Subject{
    private String role;
    private Real_Subject realSubject;
    public Proxy(String role){
        this.role = role;
        this.realSubject = new Real_Subject();
    }
    @Override
    public void doWrite() {
        if(this.role.equalsIgnoreCase("Admin")){
            System.out.println("You can write");
        }else {
            System.out.println("You can't write");
        }
    }

    @Override
    public void doRead() {
        System.out.println("You can read");
    }

    @Override
    public void doModify() {
        if(this.role.equalsIgnoreCase("Admin")){
            System.out.println("You can modify");
        }else {
            System.out.println("You can't modify");
        }
    }
}
