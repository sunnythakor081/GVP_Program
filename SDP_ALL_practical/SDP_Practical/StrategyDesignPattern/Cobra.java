public class Cobra implements Snake {
    private BiteBehavior biteBehavior;

    public Cobra() {
        this.biteBehavior = new PoisonousBite();
    }

    @Override
    public void display() {
        System.out.println("I am a Cobra!");
    }

    @Override
    public void performBite() {
        biteBehavior.bite();
    }

    @Override
    public void setBiteBehavior(BiteBehavior biteBehavior) {
        this.biteBehavior = biteBehavior;
        System.out.println("Cobra bite behavior changed!");
    }
}