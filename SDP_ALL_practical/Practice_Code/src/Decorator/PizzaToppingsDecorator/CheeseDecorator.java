package Decorator.PizzaToppingsDecorator;

public class CheeseDecorator extends PizzDecoretor{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getdescripter() {
        return pizza.getdescripter()+" ,cheese";
    }

    @Override
    public double getcost() {
        return pizza.getcost()+2.0;
    }
}
