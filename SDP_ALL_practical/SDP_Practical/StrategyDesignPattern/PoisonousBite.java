public class PoisonousBite implements BiteBehavior {
    @Override
    public void bite() {
        System.out.println("This snake has a venomous bite!");
    }
}


