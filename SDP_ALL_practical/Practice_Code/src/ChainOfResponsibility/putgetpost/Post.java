package ChainOfResponsibility.putgetpost;

public class Post implements Handlermy{
    private Handlermy handlermy;
    @Override
    public void sethandler(Handlermy handlermy) {

        this.handlermy = handlermy;

    }

    @Override
    public void handle(String request) {
        if ("POST".equalsIgnoreCase(request)) {
            System.out.println("Handled by POST");
        } else if (handlermy != null) {
            handlermy.handle(request);
        }
    }


}
