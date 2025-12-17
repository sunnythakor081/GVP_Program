package Decorator.democoffee.coffee;

public class Simcoffee implements Icoffee1{
    @Override
    public String discreapsion() {
        return "simple coffee";
    }

    @Override
    public Double cost() {
        return 5.0;
    }
}
