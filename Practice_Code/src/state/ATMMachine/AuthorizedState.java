package state.ATMMachine;

public class AuthorizedState implements Atm{
    @Override
    public void display(Context state) {
        System.out.println("You can withdraw money");
        state.setstate(new NoCashState());
    }
}
