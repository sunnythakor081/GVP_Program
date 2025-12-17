package state.ATMMachine;

public class AtmClient {
    public static void main(String[] args) {
        Context context = new Context(new HasCardState());
        context.checkpay();
        context.checkpay();
        context.checkpay();
        context.checkpay();
    }
}
