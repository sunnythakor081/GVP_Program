package Strategy.paymentMethods;

public class PayPalPayment implements PymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("paid"+amount+"using paypalpayment");
    }
}
