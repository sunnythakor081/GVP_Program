class NullPointerHandler extends ExceptionHandler {
    public void handleException(String error) {
        if (error.equals("NullPointerException")) {
            System.out.println("Handled by NullPointerHandler.");
        } else if (next != null) {
            next.handleException(error);
        }
    }
}
