class ArithmeticHandler extends ExceptionHandler {
    public void handleException(String error) {
        if (error.equals("ArithmeticException")) {
            System.out.println("Handled by ArithmeticHandler.");
        } else if (next != null) {
            next.handleException(error);
        }
    }
}
   