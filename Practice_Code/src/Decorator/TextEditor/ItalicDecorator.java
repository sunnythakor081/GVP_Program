package Decorator.TextEditor;

public class ItalicDecorator extends TextDecorator{
    public ItalicDecorator(Text text) {
        super(text);
    }

    @Override
    public String setContent() {
        return "<i>"+text.setContent()+"</i>";
    }
}
