package Strategy;

public class Python implements Snak{
    private BiteBehv biteBehv;

    public Python(){
        this.biteBehv = new Nonpoisonous();
    }
    @Override
    public String display() {
        return "i am python";
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
