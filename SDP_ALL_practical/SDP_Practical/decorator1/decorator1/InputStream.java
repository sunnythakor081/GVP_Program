import java.io.IOException;

public interface InputStream {
    public int read() throws IOException;
    public void close() throws IOException;
}
