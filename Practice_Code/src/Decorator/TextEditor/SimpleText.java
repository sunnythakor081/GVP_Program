package Decorator.TextEditor;

public class SimpleText implements Text{
    private String content;

    public SimpleText(String content){
        this.content = content;

    }
    @Override
    public String setContent() {
        return content;
    }
}
