class ArithmeticExceptionHandler implements ExceptionHandler {
    private ExceptionHandler nextHandler;

    public void setNextHandler(ExceptionHandler handler) {
        this.nextHandler = handler;
    }

    public void handleException(Exception e) {
        if (e instanceof ArithmeticException) {
            System.out.println("Handled by ArithmeticExceptionHandler: " + e.getMessage());
        } else if (nextHandler != null) {
            nextHandler.handleException(e);
        }
    }
}
