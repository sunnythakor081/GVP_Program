import java.io.IOException;

public class LineCount extends Decorator {
    private int lineCount = 0;

    public LineCount(InputStream wrappedStream) {
        super(wrappedStream);
    }

    public int read() throws IOException {
        int byteRead = wrappedStream.read();
        if (byteRead == -1) {
            return -1;
        }

        if (byteRead == '\n') {
            lineCount++;
        }
        System.out.println("Byte read: " + (char) byteRead); 
        return byteRead;
    }

    public int getLineCount() {
        return lineCount;
    }
}
