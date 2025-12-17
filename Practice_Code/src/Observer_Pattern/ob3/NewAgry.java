package Observer_Pattern.ob3;

import java.util.ArrayList;
import java.util.List;

public class NewAgry implements SubjectOb{

    List<Observnewz> observnewzs = new ArrayList<>();
    private String Newnewz;

    @Override
    public void attech(Observnewz o) {

        observnewzs.add(o);
    }

    @Override
    public void dettech(Observnewz o) {

        observnewzs.add(o);
    }

    @Override
    public void notifi() {

        for(Observnewz o: observnewzs){

            o.update(Newnewz);
        }
    }

    public void setnewz(String newz){
        this.Newnewz = newz;
        notifi();

    }
}
