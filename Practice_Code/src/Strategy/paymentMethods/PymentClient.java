package Strategy.paymentMethods;

public class PymentClient {
    public static void main(String[] args) {

        PymentStrategy p = new CreditCardPayment();
        Context context = new Context();

//        p.pay(9000);

        context.setPymentStrategy(new CreditCardPayment());
        context.check(10000);

        context.setPymentStrategy(new PayPalPayment());
        context.check(50000);



    }
}
