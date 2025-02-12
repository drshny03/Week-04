package com.tit.day02.listinterface;

import java.util.Arrays;
import java.util.List;

public class ReverseArrayList {

    public static void main(String ar[])
    {
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5);

        System.out.println("Orignal List : "+ arrayList);

        int left = 0;
        int right =arrayList.size()-1;

        while(left<right)
        {
            int temp = arrayList.get(left);
            arrayList.set(left,arrayList.get(right));
            arrayList.set(right,temp);
            left++;
            right--;
        }
        System.out.println("Reversed Array List : "+ arrayList);
    }
}
