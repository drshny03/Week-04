package com.tit.day02.listinterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class NthElementFromEnd {

    public static<T> T findNthFromEnd(LinkedList<T> list, int n)
    {
        Iterator<T> first = list.iterator();
        Iterator<T> second = list.iterator();

        for(int i =0; i<n; i++)
        {
            if(first.hasNext())
            {
                first.next();
            }
            else{
                throw new IllegalArgumentException("N is Larger than the list size");
            }
        }

        while(first.hasNext())
        {
            first.next();
            second.next();
        }
        return second.next();
    }

    public static void main(String ar[])
    {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A","B","C","D","E"));
        int N = 2;
        System.out.println("Nth Element from end is : "+ findNthFromEnd(list,N));
    }
}
