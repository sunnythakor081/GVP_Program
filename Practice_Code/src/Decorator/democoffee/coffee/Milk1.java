package Decorator.democoffee.coffee;

public class Milk1 extends CoffDecorator1{
    Milk1(Icoffee1 icoffee1) {
        super(icoffee1);
    }

    @Override
    public String discreapsion() {
        return "milk coffee";
    }

    @Override
    public Double cost() {
        return 2.0;
    }
}
