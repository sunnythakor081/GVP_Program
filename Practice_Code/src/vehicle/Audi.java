package vehicle;

public class Audi implements Createcar{
    @Override
    public String color() {
        return "car color is Black";
    }

    @Override
    public String speed() {
        return "car Speed is 160";
    }

    @Override
    public String year() {
        return "car year is 2008";
    }
}
