public class NumberFormatExceptionHandler implements ExceptionHandler {
    private ExceptionHandler nextHandler;

    public void setNextHandler(ExceptionHandler handler) {
        this.nextHandler = handler;
    }

    public void handleException(Exception e) {
        if (e instanceof NumberFormatException) {
            System.out.println("Handled by NumberFormatExceptionHandler: " + e.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleException(e);
        }
    }
}
