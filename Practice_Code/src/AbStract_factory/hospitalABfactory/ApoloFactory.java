package AbStract_factory.hospitalABfactory;

public class ApoloFactory extends HospitalFactory{
    @Override
    Cardiology getCardiology() {
        return new ApolloHospitalsCardiology();
    }

    @Override
    Neurology getNeurology() {
        return new ApolloHospitalsNeurology();
    }
}
