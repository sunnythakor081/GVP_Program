package Observer2;

public class Subscrib implements Observ{
    String obname;
    Subscrib(String observ){
        this.obname = observ;

    }
    @Override
    public void update(String notify) {
        System.out.println("hello"+obname+""+notify);

    }
}
