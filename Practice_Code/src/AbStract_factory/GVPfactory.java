package AbStract_factory;

public class GVPfactory extends CollegeFactory{
    @Override
    public Mca getMca() {
        return new GVPmca();
    }

    @Override
    public Bca getBca() {
        return new GVPbca();
    }

    @Override
    public Pgdca getpgdca() {
        return new GVPpgdca();
    }
}
