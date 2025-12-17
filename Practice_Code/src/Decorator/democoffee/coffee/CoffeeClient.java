package Decorator.democoffee.coffee;

public class CoffeeClient {
    public static void main(String[] args) {

        Icoffee1 icoffee1 = new Simcoffee();
        System.out.println(icoffee1.discreapsion()+"=$"+icoffee1.cost());
        icoffee1 = new Milk1(icoffee1);
        System.out.println(icoffee1.discreapsion()+"=$"+icoffee1.cost());
        icoffee1 = new sugar(icoffee1);
        System.out.println(icoffee1.discreapsion()+"=$"+icoffee1.cost());


    }
}
