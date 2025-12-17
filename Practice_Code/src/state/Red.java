package state;

public class Red implements Light{
    @Override
    public void lightState(State state) {
        System.out.println("Red Light");
        state.setstate(new Yellow());
    }
}
