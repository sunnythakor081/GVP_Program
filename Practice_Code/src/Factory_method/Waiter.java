package Factory_method;

public class Waiter implements Employ{
    @Override
    public int salary() {
        return 22000;
    }

    @Override
    public String name() {
        return "ramil";
    }

    @Override
    public String department() {
        return "waiter";
    }
}
