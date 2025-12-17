package Decorator;

import java.io.*;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        try {
            // Test InputStream Decorator
            String testString = "Hello world\nThis is a test\nDecorator pattern";
            InputStream inputStream = new ByteArrayInputStream(testString.getBytes());
            LoggingCountingInputStream loggingInput = new LoggingCountingInputStream(inputStream);

            // Read all bytes
            int byteRead;
            while ((byteRead = loggingInput.read()) != -1) {
                // Process byte if needed
            }
            loggingInput.printStatistics();

            System.out.println("\n--- OutputStream Test ---\n");

            // Test OutputStream Decorator
            OutputStream outputStream = new ByteArrayOutputStream();
            LoggingOutputStream loggingOutput = new LoggingOutputStream(outputStream);

            // Write some data
            String outputText = "Test output";
            for (char c : outputText.toCharArray()) {
                loggingOutput.write(c);
            }

            loggingOutput.flush();
            System.out.println("Total bytes written: " + loggingOutput.getBytesWritten());

            // Clean up
            loggingInput.close();
            loggingOutput.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}