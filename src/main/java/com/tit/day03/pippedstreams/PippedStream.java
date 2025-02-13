package com.tit.day03.pippedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class PippedStream {
    public static void main(String[] args) {
        try {
            PipedOutputStream outputStream = new PipedOutputStream();
            PipedInputStream inputStream = new PipedInputStream(outputStream);

            WriterThread writer = new WriterThread(outputStream);
            ReaderThread reader = new ReaderThread(inputStream);

            writer.start();
            reader.start();

            writer.join();
            reader.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Main thread error: " + e.getMessage());
        }
    }
}
