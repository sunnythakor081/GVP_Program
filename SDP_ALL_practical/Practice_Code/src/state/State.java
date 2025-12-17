package state;

public class State {

private Light light;

    public State()
    {
        this.light = new Green();
    }

   public void setstate(Light light)
   {
        this.light = light;
    }

    public void checkState()
    {
        light.lightState(this);
    }

}
