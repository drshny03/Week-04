package com.tit.day02.queueinterface;

import java.util.*;

public class CircularBuffer {
    private int[] buffer;
    private int size, start, end;

    public CircularBuffer(int capacity) {
        buffer = new int[capacity];
        size = 0;
        start = 0;
        end = 0;
    }

    public void insert(int value) {
        buffer[end] = value;
        end = (end + 1) % buffer.length;
        if (size < buffer.length) {
            size++;
        } else {
            start = (start + 1) % buffer.length; // Overwrite oldest element
        }
    }

    public List<Integer> getBuffer() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            result.add(buffer[(start + i) % buffer.length]);
        }
        return result;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.insert(4);
        System.out.println(cb.getBuffer()); // Output: [2, 3, 4]
    }
}
