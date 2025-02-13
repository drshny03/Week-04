package com.tit.day03.bufferedstreams;

import static java.lang.System.out;

public class BufferedStreamMain {


    public static void main(String[] args)
    {
        BufferedStream bufferedStreams = new BufferedStream();
        //define file path
        String inputFilePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\textfile.txt";
        String outputFileBuffered = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\outputtextfile.txt";
        String outputFileStream = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\outputFileStream";

        long startTime = System.nanoTime();
        bufferedStreams.copyUsingBufferedStream(inputFilePath, outputFileBuffered);
        long endTime = System.nanoTime();
        long totalTime = endTime-startTime;
        out.println("time taken by buffered stream in ms - " + totalTime/1e6);

        startTime = System.nanoTime();
        bufferedStreams.copyUsingFileStream(inputFilePath, outputFileStream);
        endTime = System.nanoTime();
        totalTime = endTime-startTime;
        out.println("time taken by file stream in ms - " + totalTime/1e6);
    }

}
