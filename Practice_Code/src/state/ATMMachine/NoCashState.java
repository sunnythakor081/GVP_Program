package state.ATMMachine;

public class NoCashState implements Atm{
    @Override
    public void display(Context state) {
        System.out.println("Machine says \"Out of Service\"");
        state.setstate(new NoCardState());
    }
}
