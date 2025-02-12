package com.tit.day02.listinterface;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {

    public static Map<String, Integer> countFrequency(List<String> list)
    {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for(int i =0; i<list.size(); i++)
        {
            int currentFreq = frequencyMap.getOrDefault(list.get(i), 0);
            int updatedFreq = currentFreq+1;
            frequencyMap.put(list.get(i),  updatedFreq);
        }
        return frequencyMap;
    }

    public static void main(String ar[])
    {
        List<String> items = Arrays.asList("Apple","Banana","Apple","Orange");
        Map<String,Integer> result = countFrequency(items);
        System.out.println(result);
    }
}
