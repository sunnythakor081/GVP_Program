package Singledemo;

public class Single_Pattern {

    private static Single_Pattern singleinstance;

    private Single_Pattern() {
    }


    public static Single_Pattern getsingleinstance() {

        synchronized (Single_Pattern.class) {
            if (singleinstance == null) {

                singleinstance = new Single_Pattern();

            }

        }
        return singleinstance;
    }

}



