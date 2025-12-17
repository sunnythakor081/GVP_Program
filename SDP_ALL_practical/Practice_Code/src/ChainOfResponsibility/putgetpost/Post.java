package ChainOfResponsibility.putgetpost;

public class Post implements Handlermy{
    private Handlermy handlermy;
    @Override
    public void sethandler(Handlermy handlermy) {

        this.handlermy = new Get();

    }

    @Override
    public void handler(Exception exception) {

        if(exception.equals("Post")){
            System.out.printf("i am Put");
        } else if (handlermy != null) {
            handlermy.handler(exception);

        }
    }
}
