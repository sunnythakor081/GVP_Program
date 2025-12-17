public class App {
    public static void main(String[] args) {
        Fan fan = new Fan();  // Start with Fan off

        fan.pressButton();  // Turning fan ON.
        fan.pressButton();  // Turning fan OFF.
        fan.pressButton();  // Turning fan ON.
    }
}
