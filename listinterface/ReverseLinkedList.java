package com.tit.day02.listinterface;

import java.util.*;

class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Original LinkedList: " + list);
        reverseLinkedList(list);
        System.out.println("Reversed LinkedList: " + list);
    }

    public static void reverseLinkedList(LinkedList<Integer> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
}
