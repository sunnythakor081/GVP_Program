package OsComponent;

public class Macfactory extends Abstractfactory{
    @Override
    public Button getbutton() {
        return new MacButton();
    }

    @Override
    public CheckButton getcheck() {
        return new MacCheckButton();
    }

    @Override
    public RadioButton getradio() {
        return new MacRadioButton();
    }
}
