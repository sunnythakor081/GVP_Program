package Decorator.TextEditor;

public class UnderlineDecorator extends TextDecorator{
    public UnderlineDecorator(Text text) {
        super(text);
    }

    @Override
    public String setContent() {
        return "<u>"+text.setContent()+"</u>";
    }
}
