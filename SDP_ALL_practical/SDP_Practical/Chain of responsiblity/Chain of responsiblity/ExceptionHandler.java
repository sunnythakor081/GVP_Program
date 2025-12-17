public interface ExceptionHandler {
    void setNextHandler(ExceptionHandler handler);
    void handleException(Exception e);
}

