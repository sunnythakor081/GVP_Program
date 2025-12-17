package It;

public class Employfactory {

    public static Employ getEmp(String empy){

        return switch (empy.toLowerCase()){
            case "computer"-> new Computer();
            case "civil"->new Civil();
            case "waiter"->new Waiter();
            default -> null;

        };
    }
}
