public class CapsLockContext {
    private CapsLockState state;
    public CapsLockContext() {
        this.state = new CapsLockOff();
    }

    public void setState(CapsLockState state) {
        this.state = state;
    }

    public void pressCapsLock() {
        state.pressCapsLock(this);
    }

    public char typeKey(char key) {
        return state.typeKey(key);
    }

    public CapsLockState getState() {
        return state;
    }

}
