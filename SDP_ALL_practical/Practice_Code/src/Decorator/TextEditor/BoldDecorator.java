package Decorator.TextEditor;

public class BoldDecorator extends TextDecorator{
    public BoldDecorator(Text text) {
        super(text);
    }

    @Override
    public String setContent() {
        return "<b>" + text.setContent()+"</b>";
    }
}
