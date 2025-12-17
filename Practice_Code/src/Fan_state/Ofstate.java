package Fan_state;

public class Ofstate implements State
{
    @Override
    public void pressButtern(Fan fan) {
        System.out.println("of fan");
    }
}
