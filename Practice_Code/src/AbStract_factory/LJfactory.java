package AbStract_factory;

public class LJfactory extends CollegeFactory{
    @Override
    public Mca getMca() {
        return new LJmca();
    }

    @Override
    public Bca getBca() {
        return new LJbca();
    }

    @Override
    public Pgdca getpgdca() {
        return new LJpgdca();
    }
}
