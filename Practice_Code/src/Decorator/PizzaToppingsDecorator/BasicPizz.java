package Decorator.PizzaToppingsDecorator;

public class BasicPizz implements Pizza{
    @Override
    public String getdescripter() {
        return "basic pizz";
    }

    @Override
    public double getcost() {
        return 5.0;
    }
}
