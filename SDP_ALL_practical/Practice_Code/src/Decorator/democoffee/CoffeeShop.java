package Decorator.democoffee;

public class CoffeeShop {

    public static void main(String[] args) {
        // Order a simple coffee
        Icoffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+ " | Cost: $" + coffee.getCost());

        // Decorate with milk
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

        // Decorate with sugar
        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

        // Decorate with whipped cream
        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.getCost());

        // Another example: Coffee with just milk and whipped cream
        Icoffee anotherCoffee = new WhippedCreamDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println(anotherCoffee.getDescription() + " | Cost: $" + anotherCoffee.getCost());
    }
}
