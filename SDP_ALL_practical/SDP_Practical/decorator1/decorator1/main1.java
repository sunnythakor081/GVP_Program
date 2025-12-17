import java.io.FileInputStream;
import java.io.IOException;

public class main1 {
    public static void main(String[] args) throws IOException {
        
        BasicInputStream basicInputStream = new BasicInputStream("input.txt");

    
        ByteCount byteCountDecorator = new ByteCount(basicInputStream);
        CharacterCount characterCountDecorator = new CharacterCount(byteCountDecorator);
        WordCount wordCountDecorator = new WordCount(characterCountDecorator);
        LineCount lineCountDecorator = new LineCount(wordCountDecorator);

        while (lineCountDecorator.read() != -1) {
        
        }

        System.out.println("Byte Count: " + byteCountDecorator.getByteCount());
        System.out.println("Character Count: " + characterCountDecorator.getCharacterCount());
        System.out.println("Word Count: " + wordCountDecorator.getWordCount());
        System.out.println("Line Count: " + lineCountDecorator.getLineCount());

        lineCountDecorator.close();
    }
}
