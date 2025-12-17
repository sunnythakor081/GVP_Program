package state.ATMMachine;

public class NoCardState implements Atm{
    @Override
    public void display(Context state) {
        System.out.println("Machine asks you to insert card");
        state.setstate(new HasCardState());
    }
}
