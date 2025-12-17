class DefaultExceptionHandler implements ExceptionHandler {
    public void setNextHandler(ExceptionHandler handler) {
        // End of chain, so nothing to set
    }

    public void handleException(Exception e) {
        System.out.println("Handled by DefaultExceptionHandler: " + e.getClass().getSimpleName() + " - " + e.getMessage());
    }
}