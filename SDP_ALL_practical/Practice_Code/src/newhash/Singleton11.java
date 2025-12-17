package newhash;

public class Singleton11 implements Cloneable{

    private static final Singleton11 instance = new Singleton11();
    private Singleton11(){}
    public static Singleton11 getInstance(){
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

//public class main{
//
//    public static void main(String[] args) {
//        try {
//            String instance1 = Singleton.getInstance();
//            String instance2 = Singleton.getInstance();
//
//        } catch (CloneNotSupportedException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}
