package ChainOfResponsibility.putgetpost;

public class Get implements Handlermy{
    private Handlermy handlermy;

    @Override
    public void sethandler(Handlermy handlermy) {
        this.handlermy = handlermy;

    }

    @Override
    public void handle(String request) {
        if ("GET".equalsIgnoreCase(request)) {
            System.out.println("Handled by GET");
        } else if (handlermy != null) {
            handlermy.handle(request);
        }

    }


}
