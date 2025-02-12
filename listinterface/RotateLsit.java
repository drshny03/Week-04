package com.tit.day02.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateLsit {

    public static<T>void rotateList(List<T>list, int positions)
    {
        int size = list.size();

        positions = positions % size;

        List<T> temp  = new ArrayList<>(list.subList(0,positions));
        list.removeAll(temp);
        list.addAll(temp);
    }

    public static void main(String ar[])
    {
        List<Integer>list = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        int rotate = 6;
        System.out.println("Orignal List : "+ list);
        rotateList(list,rotate);
        System.out.println("Rotated List : "+ list);
    }

}
