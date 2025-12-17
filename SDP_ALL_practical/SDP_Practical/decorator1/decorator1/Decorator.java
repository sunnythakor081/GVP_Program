import java.io.IOException;

public abstract class Decorator implements InputStream {
    protected InputStream wrappedStream;

    public Decorator(InputStream wrappedStream) {
        this.wrappedStream = wrappedStream;
    }

    public int read() throws IOException {
        return wrappedStream.read();
    }

    public void close() throws IOException {
        wrappedStream.close();
    }
}
