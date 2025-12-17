package OsComponent;

public class Windowfactory extends Abstractfactory{
    @Override
    public Button getbutton() {
        return new WindowButton();
    }

    @Override
    public CheckButton getcheck() {
        return new WindowCheckButton();
    }

    @Override
    public RadioButton getradio() {
        return new WindowRadio();
    }
}
