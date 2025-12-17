package ChainOfResponsibility.putgetpost;

public class Put implements Handlermy{
    private Handlermy handlermy;
    @Override
    public void sethandler(Handlermy handlermy) {
        this.handlermy = handlermy;

    }

    @Override
    public void handler(Exception exception) {

        if(exception.equals("Put")){
            System.out.printf("i am put");
        } else if (exception != null) {

            handlermy.handler(exception);

        }
    }
}
