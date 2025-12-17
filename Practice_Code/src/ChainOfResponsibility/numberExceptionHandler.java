package ChainOfResponsibility;

public class numberExceptionHandler implements ExceptionHandler {
    private ExceptionHandler nexthandel;



    @Override
    public void sethandel(ExceptionHandler handler) {

        this.nexthandel = handler;

    }



    @Override
    public void handelException(Exception e) {

        if(e instanceof NumberFormatException){
//            System.out.println("NumberFormatExceptionHandler"+((NumberFormatException) e).getMessage());
            System.out.println(((NumberFormatException) e).getMessage());
        }else if(nexthandel != null){
            nexthandel.handelException(e);

        }

    }
}
