package com.tit.day02.setinterface;

import java.util.*;

public class SetToSortedList {
    public static List<Integer> convertAndSort(Set<Integer> set) {
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Sorted List: " + convertAndSort(set)); // Output: [1, 3, 5, 9]
    }
}
