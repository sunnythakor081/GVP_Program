package ChainOfResponsibility;

public interface ExceptionHandler {
    void sethandel(ExceptionHandler handler);
    void handelException(Exception e);

}
