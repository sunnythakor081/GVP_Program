package Strategy.paymentMethods;

public class CreditCardPayment implements PymentStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("paid "+ amount + "using creditcart");

    }
}
