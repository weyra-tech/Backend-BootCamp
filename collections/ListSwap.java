package collections;

/*
Write a method that accepts a list and two position ints and swaps the elements in the two positions
The method should be generic and accept any List
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSwap {

    public ArrayList swap(List<?> list, int positionOne, int positionTwo)
    {
        Collections.swap(list,positionOne,positionTwo);
        return (ArrayList) list;
    }

    public static void main(String[] args) {

        ListSwap listSwap = new ListSwap();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for(int i:list)
        {
            System.out.println(i);
        }

        listSwap.swap(list,1,4);


       for(int element:list)
       {
           System.out.println(element);
       }

    }
}
