package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter the size of the array");
        number = input.nextInt();
        int[] lists = new int[number];
        System.out.println("Enter the element of the array");
        for (int i = 0; i < number; i++) {
            lists[i] = input.nextInt();
        }
        int max = lists[0];
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] > max) {
                max = lists[i];
            }
        }
        System.out.println("The maximum Number from the given list is " + max);
    }

}
