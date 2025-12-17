package Observer2;

public class Subscrib implements Observ {

    private String obname;

    public Subscrib(String obname) {
        this.obname = obname;
    }

    @Override
    public void update(String notification) {
        System.out.println("Hello " + obname + ", " + notification);
    }
}
