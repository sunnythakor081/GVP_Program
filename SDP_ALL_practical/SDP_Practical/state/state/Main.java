import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CapsLockContext context = new CapsLockContext();
        
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String state = (context instanceof CapsLockContext && context.getState() instanceof CapsLockOn) ? "ON" : "OFF";
            System.out.println("Current CapsLock state: " + state);
            System.out.println("Enter '1' to ON CapsLock");

            String input = scanner.nextLine();
            
            
            if (input.equals("1")) {
                context.pressCapsLock();
            } else if (input.length() == 1) {
                char typedChar = input.charAt(0);
                System.out.println("You are Entered : " + context.typeKey(typedChar));
            } else {
                System.out.println("Invalid input. Please enter 't' to toggle CapsLock or a single character to type.");
            }
        }
    }
}
