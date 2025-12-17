package Observer_Pattern.ob3;

public class Client {
    public static void main(String[] args) {

        NewAgry n = new NewAgry();

        Observnewz use1 = new InstaSubcrib("kk");
        Observnewz user2 = new InstaSubcrib("mm");

        n.attech(use1);
        n.attech(user2);

        n.setnewz("csk win");
        n.setnewz("srs fill");


    }
}
