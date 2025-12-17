package Decorator.democoffee;

public class SugarDecorator extends CoffeeDecorator{
    public SugarDecorator(Icoffee icoffee) {
        super(icoffee);
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Sugar";
    }

    @Override
    public Double getCost() {
        return decoratorCoffee.getCost() + 0.20; // Sugar adds $0.20
    }
}
