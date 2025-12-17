package Decorator;

import java.io.IOException;
import java.io.OutputStream;

class LoggingOutputStream extends OutputStreamDecorator {
    private long bytesWritten = 0;

    public LoggingOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
        bytesWritten++;
        System.out.println("Wrote byte: " + b + " (Total bytes: " + bytesWritten + ")");
    }

    public long getBytesWritten() {
        return bytesWritten;
    }
}