package vehicle;

public class BMW implements Createcar {
    @Override
    public String color() {
        return "car color is Red";
    }

    @Override
    public String speed() {
        return "car Speed is 120";
    }

    @Override
    public String year() {
        return "car year is 2003";
    }
}
