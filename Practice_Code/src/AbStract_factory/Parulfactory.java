package AbStract_factory;

public class Parulfactory extends CollegeFactory{
    @Override
    public Mca getMca() {
        return new ParulMca();
    }

    @Override
    public Bca getBca() {
        return new PARULBca();
    }

    @Override
    public Pgdca getpgdca() {
        return new Parul_Pgdca();
    }
}
