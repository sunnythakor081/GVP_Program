public class Client {
    public static void main(String[] args) {
        // Create handlers
        ExceptionHandler numberHandler = new NumberFormatExceptionHandler();
        ExceptionHandler arithmeticHandler = new ArithmeticExceptionHandler();
        ExceptionHandler defaultHandler = new DefaultExceptionHandler();

        numberHandler.setNextHandler(arithmeticHandler);
        arithmeticHandler.setNextHandler(defaultHandler);

        try {
            Integer.parseInt("aaa");
        } catch (Exception e) {
            numberHandler.handleException(e);
        }

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            numberHandler.handleException(e);
        }
        try {
            String s = null;
            s.length();
        } catch (Exception e) {
            numberHandler.handleException(e);
        }

    }
}
