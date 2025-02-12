package com.tit.day02.mapinterface;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

class FrequencyCounter {
    public static Map<String, Integer> countWordFrequency(String text)
    {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.toLowerCase().split(" ");

        for (String word : words) {
            word = cleanWord(word); // Remove punctuation manually
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    private static String cleanWord(String word)
    {
        StringBuilder cleaned = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                cleaned.append(c);
            }
        }
        return cleaned.toString();
    }

    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(countWordFrequency(text)); // Output: {hello=2, world=1, java=1}
    }
}
