package com.tit.day03.filterstreams;

import java.io.*;

public class FileStream {

    public static void main(String[] args) {
        String inputFilePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\textfile.txt";
        String outputFilePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\filestreamtextfile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            System.out.println("File conversion successful. Output saved as: " + outputFilePath);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

}
