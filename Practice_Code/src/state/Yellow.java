package state;

public class Yellow implements Light{
    @Override
    public void lightState(State state) {
        System.out.println("Yellow Light");
        state.setstate(new Green());
    }
}
