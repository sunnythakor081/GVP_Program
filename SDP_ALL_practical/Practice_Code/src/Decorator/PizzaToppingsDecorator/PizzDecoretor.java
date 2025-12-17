package Decorator.PizzaToppingsDecorator;

 abstract class PizzDecoretor implements Pizza{
    protected Pizza pizza;

    public PizzDecoretor(Pizza pizza){
        this.pizza = pizza;
    }
}
