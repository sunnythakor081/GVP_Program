package Decorator.PizzaToppingsDecorator;

public class OliveDecorator extends PizzDecoretor{


    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }


    @Override
    public String getdescripter() {
        return pizza.getdescripter()+" ,olive";
    }

    @Override
    public double getcost() {
        return pizza.getcost()+3.0;
    }
}
