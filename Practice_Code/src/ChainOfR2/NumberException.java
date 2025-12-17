package ChainOfR2;

public class NumberException implements Exceptionhandl{
    private Exceptionhandl exceptionhandl;

    @Override
    public void sethandler(Exceptionhandl handl) {
        this.exceptionhandl = handl;

    }

    @Override
    public void handlException(Exception e) {
        if(e instanceof NumberFormatException){
            System.out.println("number Exception"+e.getMessage());
        }

    }
}
