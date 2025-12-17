package Decorator;

import java.io.IOException;
import java.io.InputStream;

class LoggingCountingInputStream extends InputStreamDecorator {
    private long bytesRead = 0;
    private int characters = 0;
    private int words = 0;
    private int lines = 0;
    private boolean inWord = false;

    public LoggingCountingInputStream(InputStream inputStream) {
        super(inputStream);
    }

    @Override
    public int read() throws IOException {
        int byteRead = super.read();
        if (byteRead != -1) {
            bytesRead++;
            characters++;

            // Count words and lines
            char c = (char) byteRead;
            if (Character.isWhitespace(c)) {
                if (inWord) {
                    words++;
                    inWord = false;
                }
                if (c == '\n') {
                    lines++;
                }
            } else {
                inWord = true;
            }

            System.out.println("Read byte: " + byteRead + " (Total bytes: " + bytesRead + ")");
        }
        return byteRead;
    }

    public void printStatistics() {
        // Add 1 to words if last character wasn't whitespace
        if (inWord) {
            words++;
        }
        System.out.println("Statistics:");
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);
        System.out.println("Total bytes read: " + bytesRead);
    }
}