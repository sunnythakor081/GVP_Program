package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Insta implements Subject{
    private String notificaton;
    private String chanal;

    List<Observ> observs = new ArrayList<>();

    Insta(String chanal){
        this.chanal = chanal;
    }

    public void upload(String upload){
        this.notificaton = this.chanal + "upload video"+upload;
        notifyy();
    }


    @Override
    public void register(Observ o) {
        observs.add(o);
    }

    @Override
    public void removeregister(Observ o) {

        observs.add(o);
    }

    @Override
    public void notifyy() {

        for (Observ o: observs){
            o.update(this.notificaton);
        }
    }
}
