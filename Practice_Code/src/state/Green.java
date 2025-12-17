package state;

public class Green implements Light{
    @Override
    public void lightState(State state) {
        System.out.println("Green Light");
        state.setstate(new Red());
    }
}
