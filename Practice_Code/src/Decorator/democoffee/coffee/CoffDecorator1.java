package Decorator.democoffee.coffee;

abstract class CoffDecorator1 implements Icoffee1{

    protected Icoffee1 coffdecorator;

    CoffDecorator1(Icoffee1 icoffee1){
        this.coffdecorator = icoffee1;
    }

}
