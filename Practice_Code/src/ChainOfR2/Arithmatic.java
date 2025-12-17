package ChainOfR2;

public class Arithmatic implements Exceptionhandl{
    private Exceptionhandl exceptionhandl;
    @Override
    public void sethandler(Exceptionhandl handl) {
        this.exceptionhandl = handl;

    }

    @Override
    public void handlException(Exception e) {

        if(e instanceof ArithmeticException){
            System.out.println("arithmation exception"+e.getMessage());
        } else if ( exceptionhandl!= null) {
            exceptionhandl.handlException(e);

        }
    }

}
