package Decorator.democoffee;

 abstract class CoffeeDecorator implements Icoffee {
     protected Icoffee decoratorCoffee;

     public CoffeeDecorator(Icoffee icoffee){
         this.decoratorCoffee = icoffee;

     }
     @Override
     public String getDescription() {
         return decoratorCoffee.getDescription();
     }

     @Override
     public Double getCost() {
         return decoratorCoffee.getCost();
     }
 }
