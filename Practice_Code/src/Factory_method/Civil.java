package Factory_method;

public class Civil implements Employ{
    @Override
    public int salary() {
        return 20000;
    }

    @Override
    public String name() {
        return "subham";
    }

    @Override
    public String department() {
        return "Civil";
    }
}
