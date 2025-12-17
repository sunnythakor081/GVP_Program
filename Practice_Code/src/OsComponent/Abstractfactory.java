package OsComponent;





public abstract class Abstractfactory {
    public abstract Button getbutton();

    public abstract CheckButton getcheck();

    public abstract RadioButton getradio();

    public static Abstractfactory getosname(String osname) {


        switch (osname.toLowerCase()) {
            case "window":
                return new Windowfactory();

            case "mac":
                return new Macfactory();

            case "linux":
                return new Linaxfactory();

            default:
                return null;
        }


    }
}




