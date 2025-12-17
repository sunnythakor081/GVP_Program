package ChainOfR2;

public class Main {
    public static void main(String[] args) {
        Exceptionhandl num = new NumberException();
        Exceptionhandl arith = new Arithmatic();
        Exceptionhandl def = new Default();

        num.sethandler(arith);
        arith.sethandler(def);

        try {
            Integer.parseInt("fff");
        }catch (Exception e){

            num.handlException(e);
        }
        try {
            int a = 10/0;
        } catch (Exception e) {
            arith.handlException(e);
        }
    }
}
