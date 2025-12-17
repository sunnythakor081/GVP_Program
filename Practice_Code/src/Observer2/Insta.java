package Observer2;

import java.util.ArrayList;
import java.util.List;

public class Insta implements Subject {

    private String notification;
    private String channel;

    private List<Observ> observs = new ArrayList<>();

    public Insta(String channel) {
        this.channel = channel;
    }

    public void upload(String videoName) {
        this.notification = channel + " uploaded a new video: " + videoName;
        notifyy();
    }

    @Override
    public void register(Observ o) {
        observs.add(o);
    }

    @Override
    public void removeregister(Observ o) {
        observs.remove(o);   // ✅ FIXED
    }

    @Override
    public void notifyy() {
        for (Observ o : observs) {
            o.update(notification);
        }
    }
}
