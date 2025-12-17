package Strategy.paymentMethods;

public class BitcoinPayment implements PymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("paid"+amount+"using bitcoibpayment");
    }
}
