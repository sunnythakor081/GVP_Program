

public class CapsLockOn implements CapsLockState {
    @Override
    public void pressCapsLock(CapsLockContext context) {
        System.out.println("Turning CapsLock Off");
        context.setState(new CapsLockOff());
    }

    @Override
    public char typeKey(char key)
    {
        return Character.toUpperCase(key);  // Convert character to uppercase
    }
}