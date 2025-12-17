package Decorator.PizzaToppingsDecorator;

public class PizzClient {
    public static void main(String[] args) {

        Pizza pizza = new BasicPizz();
        System.out.println(pizza.getdescripter()+"= $"+pizza.getcost());


        Pizza pizza1 = new CheeseDecorator(pizza);
        pizza = new OliveDecorator(pizza);


        System.out.println(pizza1.getdescripter()+"= $"+pizza1.getcost());
        System.out.println(pizza.getdescripter()+"= $"+pizza.getcost());








    }
}
