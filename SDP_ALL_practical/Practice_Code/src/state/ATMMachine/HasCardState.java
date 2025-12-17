package state.ATMMachine;

public class HasCardState implements Atm{
    @Override
    public void display(Context state) {
        System.out.println("Machine asks for PIN");
        state.setstate(new AuthorizedState());
    }
}
