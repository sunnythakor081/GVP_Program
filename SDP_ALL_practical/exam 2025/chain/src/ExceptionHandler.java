abstract class ExceptionHandler {
    protected ExceptionHandler next;

    public void setNext(ExceptionHandler next) {
        this.next = next;
    }

    public abstract void handleException(String error);
}
