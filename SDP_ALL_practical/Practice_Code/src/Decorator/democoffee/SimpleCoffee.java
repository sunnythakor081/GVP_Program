package Decorator.democoffee;

public class SimpleCoffee implements Icoffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public Double getCost() {
        return 4.0;
    }
}
