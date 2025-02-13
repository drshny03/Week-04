package com.tit.day03.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static java.lang.System.out;

public class FileHandling
{
    public static void main(String ar[])
    {
        String inputFilePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\textfile.txt";
        String outputFilePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\outputtextfile.txt";

        try(FileInputStream fileInputStream = new FileInputStream(inputFilePath);
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath)){
            //get current char
            int currentChar;
            while((currentChar = fileInputStream.read()) != -1){
                //write character to file
                fileOutputStream.write(currentChar);
            }
        } catch (FileNotFoundException e) {
            out.println("file not found");
        } catch (IOException e) {
            out.println("exception while reading file");
        }
    }

}

