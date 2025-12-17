package Decorator.TextEditor;

public class TextClient {
    public static void main(String[] args) {
        Text t = new SimpleText("hello word");

//        t = new BoldDecorator(t);
        t = new ItalicDecorator(t);
//        t = new UnderlineDecorator(t);

        System.out.println(t.setContent());
    }
}
