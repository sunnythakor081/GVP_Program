package Decorator.democoffee.coffee;

public class sugar extends CoffDecorator1{
    sugar(Icoffee1 icoffee1) {
        super(icoffee1);
    }

    @Override
    public String discreapsion() {
        return "junnjsja coffee";
    }

    @Override
    public Double cost() {
        return 3.0;
    }
}
