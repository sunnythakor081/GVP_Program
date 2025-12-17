package ChainOfResponsibility;

public class Defoluthandel implements ExceptionHandler{
    @Override
    public void sethandel(ExceptionHandler handler) {

    }

    @Override
    public void handelException(Exception e) {

        System.out.println("Handled by DefaultExceptionHandler: " + e.getClass().getSimpleName() + " - " + e.getClass());
    }
}
