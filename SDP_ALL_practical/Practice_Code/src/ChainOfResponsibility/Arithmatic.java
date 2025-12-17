package ChainOfResponsibility;

public class Arithmatic implements ExceptionHandler {
    private ExceptionHandler nexthandel;

    @Override
    public void sethandel(ExceptionHandler handler) {
        this.nexthandel = handler;

    }

    @Override
    public void handelException(Exception e) {
        if(e instanceof ArithmeticException){
            System.out.println("ArithmeticExceptionHandler"+ e.getMessage());
        }else if(nexthandel != null)
        {
            nexthandel.handelException(e);
        }

    }
}
