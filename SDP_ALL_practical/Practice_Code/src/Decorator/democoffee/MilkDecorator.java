package Decorator.democoffee;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Icoffee icoffee) {
        super(icoffee);
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Milk";
    }

    @Override
    public Double getCost() {
        return decoratorCoffee.getCost() + 0.50; // Milk adds $0.50
    }
}
