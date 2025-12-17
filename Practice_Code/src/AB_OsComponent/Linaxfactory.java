package AB_OsComponent;

public class Linaxfactory extends Abstractfactory{
    @Override
    public Button getbutton() {
        return new LInaxButton();
    }

    @Override
    public CheckButton getcheck() {
        return new LinaxCheckButton();
    }

    @Override
    public RadioButton getradio() {
        return new LinaxRadioButton();
    }
}
