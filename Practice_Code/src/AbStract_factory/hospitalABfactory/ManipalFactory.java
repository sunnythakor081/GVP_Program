package AbStract_factory.hospitalABfactory;

public class ManipalFactory extends HospitalFactory{
    @Override
    Cardiology getCardiology() {
        return new ManipalHospitalCardiology();
    }

    @Override
    Neurology getNeurology() {
        return new ManipalHospitalNeurology();
    }
}
