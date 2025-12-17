package state.ATMMachine;

public class Context {
    private Atm atm;

    Context(Atm atm){
        this.atm = new NoCardState();
    }
    public void setstate(Atm atm){

        this.atm = atm;
    }

    public void checkpay(){
        atm.display(this);
    }
}
