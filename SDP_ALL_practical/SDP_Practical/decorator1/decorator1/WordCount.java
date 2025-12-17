import java.io.IOException;

public class WordCount extends Decorator {
    private int wordCount = 0;
    private boolean lastWasWhitespace = true;

    public WordCount(InputStream wrappedStream) {
        super(wrappedStream);
    }

    public int read() throws IOException {
        int byteRead = wrappedStream.read();
        if (byteRead == -1) {
            return -1;
        }

        if (Character.isLetterOrDigit(byteRead)) {
            if (lastWasWhitespace) {
                wordCount++;
            }
            lastWasWhitespace = false;
        } else if (Character.isWhitespace(byteRead)) {
            lastWasWhitespace = true;
        }
        System.out.println("Byte read: " + (char) byteRead); 
        return byteRead;
    }

    public int getWordCount() {
        return wordCount;
    }
}
