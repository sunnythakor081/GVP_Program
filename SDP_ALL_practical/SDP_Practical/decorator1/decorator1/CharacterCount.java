import java.io.IOException;

public class CharacterCount extends Decorator {
    private int characterCount = 0;

    public CharacterCount(InputStream wrappedStream) {
        super(wrappedStream);
    }

    public int read() throws IOException {
        int byteRead = wrappedStream.read();
        if (byteRead == -1) {
            return -1;
        }
        if (Character.isLetterOrDigit(byteRead)) {
            characterCount++;
        }
        System.out.println("Character read: " + (char) byteRead); 
        return byteRead;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}
