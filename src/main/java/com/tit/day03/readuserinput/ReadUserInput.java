package com.tit.day03.readuserinput;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;

public class ReadUserInput {

    public static void main(String ar[])
    {
        String filePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\userdata";

        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            FileWriter fileWriter = new FileWriter(filePath,true);

            String input;
            out.println("Enter Your Name - ");
            input = bufferedReader.readLine();
            fileWriter.write("Name - "+input);

            out.println("Enter Your Age - ");
            input = bufferedReader.readLine();
            fileWriter.write("\nAge - "+input);

            out.println("Enter Your Favorite Programming Language - ");
            input = bufferedReader.readLine();
            fileWriter.write("\nProgramming Language - "+input);
            fileWriter.flush();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
