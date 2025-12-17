package ChainOfR2;

public class Default implements Exceptionhandl{

    @Override
    public void sethandler(Exceptionhandl handl) {

    }

    @Override
    public void handlException(Exception e) {

        System.out.println("exception handel"+e.getMessage().getClass().getName());
    }
}
