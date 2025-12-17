package Singledemo;

public class Main {

    public static void main(String[] args) {

//        Singleton st = Singleton.getInstance();
//        st.show();

        Single_Pattern sp = Single_Pattern.getsingleinstance();
        Singleton p = Singleton.getInstance();
        p.show();
        System.out.println(sp.hashCode());

        Single_Pattern sp2 = Single_Pattern.getsingleinstance();
        System.out.println((sp2.hashCode()));

        Singleton p2 = Singleton.getInstance();
        p2.show();
        System.out.println(p2.hashCode());


    }
}
