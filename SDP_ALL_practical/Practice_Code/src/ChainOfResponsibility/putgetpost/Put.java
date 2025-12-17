package ChainOfResponsibility.putgetpost;

public class Put implements Handlermy{
    private Handlermy handlermy;

    @Override
    public void sethandler(Handlermy handlermy) {
        this.handlermy = handlermy;

    }

    @Override
    public void handle(String request) {
        if ("PUT".equalsIgnoreCase(request)) {
            System.out.println("Handled by PUT");
        } else {
            System.out.println("Request not supported: " + request);
        }
    }


}
