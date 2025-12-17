package ChainOfResponsibility.putgetpost;

public interface Handlermy {

    void sethandler(Handlermy handlermy);
    void handle(String request);
}
