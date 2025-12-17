public class NonPoisonousBite implements BiteBehavior {
    @Override
    public void bite() {
        System.out.println("This snake has a harmless bite.");
    }
}