package Fan_state;

public class Onstate implements State{
    @Override
    public void pressButtern(Fan fan) {
        System.out.println("on fan");
        fan.setState(new Ofstate());

    }
}
