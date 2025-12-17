public class Main {
    public static void main(String[] args) {
        ExceptionHandler nullHandler = new NullPointerHandler();
        ExceptionHandler arithmeticHandler = new ArithmeticHandler();
        ExceptionHandler defaultHandler = new DefaultHandler();

        // Chain: Null → Arithmetic → Default
        nullHandler.setNext(arithmeticHandler);
        arithmeticHandler.setNext(defaultHandler);

        // Simulate error handling
        nullHandler.handleException("NullPointerException1");
        nullHandler.handleException("ArithmeticException");
        nullHandler.handleException("IOException");
    }
}
