package client;

public class AbstractFactory {

    public static Create_Component getcom(String os){

        Create_Component object = switch (os) {
            case "window" -> new Window();
            case "mac" -> new Mac();
            case "linax" -> new Linux();
            default -> null;
        };

        return object;
    }

}
