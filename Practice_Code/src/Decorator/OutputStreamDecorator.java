package Decorator;

import java.io.IOException;
import java.io.OutputStream;

abstract class OutputStreamDecorator extends OutputStream {
    protected OutputStream outputStream;

    public OutputStreamDecorator(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @Override
    public void write(int b) throws IOException {
        outputStream.write(b);
    }

    @Override
    public void flush() throws IOException {
        outputStream.flush();
    }

    @Override
    public void close() throws IOException {
        outputStream.close();
    }
}