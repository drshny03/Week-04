package com.tit.day03.readlargefile;

import java.io.*;

public class LargeFile {
    public static void main(String[] args) {
        String filePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\textfile.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
