package Prototype_ShallowGameGOF;

public interface IGame extends Cloneable {
    IGame clone();
    void showAttributes();
}