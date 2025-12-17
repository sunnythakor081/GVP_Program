package AbStract_factory.hospitalABfactory;

abstract class HospitalFactory {
    abstract Cardiology getCardiology();

    abstract Neurology getNeurology();

    public static HospitalFactory gethospital(String hospitalname) {

        switch (hospitalname.toLowerCase()){

            case "apolo":
                return new ApoloFactory();

            case "manipal":
                return new ManipalFactory();

            default:
                throw new IllegalArgumentException();
        }
    }



}
