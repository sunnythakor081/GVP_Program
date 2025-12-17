package Strategy.paymentMethods;

public class Context {


    private PymentStrategy pymentStrategy;
//
//    public Context(PymentStrategy pymentStrategy){
//        this.pymentStrategy = new CreditCardPayment();
//    }


    public void setPymentStrategy(PymentStrategy pymentStrategy) {
        this.pymentStrategy = pymentStrategy;
    }

    public void check(int amount){
        if(pymentStrategy == null){
            System.out.println("no payment method selected");
        }else {
            pymentStrategy.pay(amount);
        }
    }

    }

