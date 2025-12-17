public class Main {
    public static void main(String[] args) {
        Snake cobra = new Cobra();

        cobra.display();
        cobra.performBite(); 
        System.out.println("Changing Cobra's bite behavior...");

        cobra.setBiteBehavior(new NonPoisonousBite()); 
        cobra.performBite();
    }
}