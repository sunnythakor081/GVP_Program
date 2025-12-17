class DefaultHandler extends ExceptionHandler {
    public void handleException(String error) {
        System.out.println("Unhandled Exception: " + error);
    }
}
