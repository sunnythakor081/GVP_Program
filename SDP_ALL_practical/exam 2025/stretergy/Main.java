public class Main {
    public static void main(String[] args) {
        Stretergy s=new Stretergy();
        System.out.println(s.CheckBehavior());

        s.setBehaviour(new Dancing());
        System.out.println(s.CheckBehavior());
    }
}
