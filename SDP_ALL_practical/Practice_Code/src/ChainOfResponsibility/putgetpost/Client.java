package ChainOfResponsibility.putgetpost;

public class Client {
    public static void main(String[] args) {

        Handlermy h = new Get();
        Handlermy n = new Post();
        Handlermy ou = new Put();

        h.sethandler(n);
        n.sethandler(ou);




    }
}
