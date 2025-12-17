package Factory_method;

public class Computer implements Employ {
    @Override
    public int salary() {
        return 45000;
    }

    @Override
    public String name() {
        return "vinod";
    }

    @Override
    public String department() {
        return "Factory_method";
    }
}
