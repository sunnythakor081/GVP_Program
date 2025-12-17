
package AbStract_factory;

public abstract class CollegeFactory {

    public abstract Mca getMca();
    public abstract Bca getBca();
    public abstract Pgdca getpgdca();

    public static CollegeFactory getCollegename(String Collegename){

        switch (Collegename.toUpperCase()){

            case "GVP":
                return new GVPfactory();

            case "LJ":
                return new LJfactory();

            case "PARUL":
                return new Parulfactory();

            default:
                throw new IllegalArgumentException();
        }

    }

}
