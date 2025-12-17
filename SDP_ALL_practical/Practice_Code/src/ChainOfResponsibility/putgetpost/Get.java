package ChainOfResponsibility.putgetpost;

public class Get implements Handlermy{
    private Handlermy handlermy;
    @Override
    public void sethandler(Handlermy handlermy) {
        this.handlermy = handlermy;

    }

    @Override
    public void handler(Exception exception) {

        if(exception.equals("Get")){
            System.out.printf("I am Get method");

        }else if(handlermy != null){
             handlermy.handler(exception);

        }
    }
}
