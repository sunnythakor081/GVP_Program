package Decorator;

import java.io.IOException;
import java.io.InputStream;

abstract class InputStreamDecorator extends InputStream {
    protected InputStream inputStream;

    public InputStreamDecorator(InputStream inputStream)
    {
        this.inputStream = inputStream;
    }

    @Override
    public int read() throws IOException {
        return inputStream.read();
    }

    @Override
    public void close() throws IOException {
        inputStream.close();
    }
}