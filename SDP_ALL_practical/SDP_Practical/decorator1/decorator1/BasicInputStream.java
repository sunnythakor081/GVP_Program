import java.io.FileInputStream;
import java.io.IOException;

public class BasicInputStream implements InputStream {
    private FileInputStream fileInputStream;

    public BasicInputStream(String fileName) throws IOException {
        fileInputStream = new FileInputStream(fileName);
    }

    public int read() throws IOException {
        return fileInputStream.read();
    }

    public void close() throws IOException {
        fileInputStream.close();
    }
}
