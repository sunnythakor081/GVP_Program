package ChainOfResponsibility;

public class Client {
    public static void main(String[] args) {


        ExceptionHandler num = new numberExceptionHandler();
        ExceptionHandler art = new Arithmatic();
        ExceptionHandler def = new Defoluthandel();


        num.sethandel(art);
        art.sethandel(def);


        try {

            Integer.parseInt("ppp");

        } catch (Exception e) {
            num.handelException(e);
        }

        try {
            int result = 10/0;
        } catch (Exception e) {

            art.handelException(e);
        }



    }
}
