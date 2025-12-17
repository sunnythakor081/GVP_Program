package Strategy;

public class Cobra implements Snak{
    private BiteBehv biteBehv;

    public Cobra(){
        this.biteBehv = new Poisonous();
    }
    @Override
    public String display() {
        return "i am cobra";
    }

    @Override
    public String behviyar() {
        return biteBehv.bite();
    }

    @Override
    public void setbehviyar(BiteBehv biteBehv) {

        this.biteBehv = biteBehv;
    }
}
