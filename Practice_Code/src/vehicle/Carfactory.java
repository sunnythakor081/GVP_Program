package vehicle;

public class Carfactory {
    public static Createcar getcar(String Carname){

       Createcar obj= switch (Carname.toUpperCase()){
            case "BMW" -> new BMW();
            case "Audi" -> new Audi();
            case "Honda"-> new Honda();
           default -> null;
        };
       return obj;
    }

}
