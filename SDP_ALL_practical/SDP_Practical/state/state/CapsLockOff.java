
public class CapsLockOff implements CapsLockState {
    @Override
    public void pressCapsLock(CapsLockContext context) {
        System.out.println("Turning CapsLock On");
        context.setState(new CapsLockOn());
    }

    @Override
    public char typeKey(char key) {
        return Character.toLowerCase(key);  // Convert character to lowercase
    }
}