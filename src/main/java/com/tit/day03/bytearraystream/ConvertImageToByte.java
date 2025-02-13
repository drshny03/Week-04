package com.tit.day03.bytearraystream;

import java.io.*;

public class ConvertImageToByte {


    public static void main(String[] args) {
        String inputImagePath ="C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\IMG_20210307_232016_0.jpg";
        String outputImagePath = "C:\\capgeminitraining\\Week-4\\Java Strams\\src\\main\\resources\\output.jpg";

        try {
            // Read image file into byte array
            byte[] imageBytes = readImageToByteArray(inputImagePath);

            // Write byte array to a new image file
            writeByteArrayToImage(imageBytes, outputImagePath);

            System.out.println("Image conversion successful. Output image saved as: " + outputImagePath);
        } catch (IOException e) {
            System.err.println("Error during image processing: " + e.getMessage());
        }
    }

    public static byte[] readImageToByteArray(String imagePath) throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream();
             FileInputStream fis = new FileInputStream(imagePath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }
            return baos.toByteArray();
        }
    }

    public static void writeByteArrayToImage(byte[] imageBytes, String outputPath) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(outputPath)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }


}
