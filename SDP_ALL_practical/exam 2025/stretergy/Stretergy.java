public class Stretergy {
    private robot r;

    public Stretergy() {
        r = new Sleep();
    }

    public String CheckBehavior() {
        return r.PerformTask();
    }

    public void setBehaviour(robot s) {
        this.r = s;
    }
}
