package collections;

/*
Initialize an ArrayList, set the value to a few integers
Then write code to find the sum of all integers
 */

import java.util.*;

public class ListExercise {

    public static void main(String[] args) {
        int sum=0;
        ArrayList<Integer> arrayList =new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(20);
        arrayList.add(50);
        for(int element:arrayList)
        {
            sum+=element;
        }
        System.out.println("Sum of the arraylist is = " + sum);


    }

}
