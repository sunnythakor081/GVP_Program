package Decorator.democoffee;

public class WhippedCreamDecorator extends CoffeeDecorator{
    public WhippedCreamDecorator(Icoffee icoffee) {
        super(icoffee);
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public Double getCost() {
        return decoratorCoffee.getCost() + 0.75; // Whipped cream adds $0.75
    }
}
