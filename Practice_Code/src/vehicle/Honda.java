package vehicle;

public class Honda implements Createcar{
    @Override
    public String color() {
        return "car is pink";
    }

    @Override
    public String speed() {
        return "car Speed is 90";
    }

    @Override
    public String year() {
        return "year is 2019";
    }
}
