package assignments;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        System.out.println("Enter the First Number");
        number= input.nextDouble();
        if(number==0)
        {
            System.out.println("number is zero");
        } else if (number>0) {
            System.out.println("number is positive");


        }else {
            System.out.println("Number is  Negative");

        }
    }
}
