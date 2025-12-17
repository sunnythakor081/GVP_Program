import java.io.IOException;

public class ByteCount extends Decorator {
    private int byteCount = 0;

    public ByteCount(InputStream wrappedStream) {
        super(wrappedStream);
    }

    public int read() throws IOException {
        int byteRead = wrappedStream.read();
        if (byteRead == -1) {
            return -1;
        }
        byteCount++;
        System.out.println("Byte read: " + byteRead);
        return byteRead;
    }

    public int getByteCount() {
        return byteCount;
    }

}
