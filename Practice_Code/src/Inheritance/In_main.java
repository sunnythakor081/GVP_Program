package Inheritance;

class Animal{
    public void dog(){
        System.out.println("i am dog");
    }

}

class Age extends Animal{

    public void dog(){
        System.out.println("dog age 20");
    }
}

class name{
    public void dog(){
        System.out.println("not any class support dog");
    }
}
public class In_main {

    public static void main(String[] args) {

        Animal a = new Animal();
        a.dog();
    }
}
