public class Python implements Snake {
    private BiteBehavior biteBehavior;

    public Python() {
        this.biteBehavior = new NonPoisonousBite();
    }

    @Override
    public void display() {
        System.out.println("I am a Python!");
    }

    @Override
    public void performBite() {
        biteBehavior.bite();
    }