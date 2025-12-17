package myshollw;

public class MygameClient {
    public static void main(String[] args) {
        System.out.println("first start");
        IMyGame myGame = new MyGamecharacter("Andy", "omita", 100);
        System.out.println("original");
        myGame.ShowAttribute();
        System.out.println("after change clone");
        MyGamecharacter mygame2 = (MyGamecharacter) myGame.clone();
        mygame2.setCharactername("victer");
        mygame2.ShowAttribute();
    }
}
