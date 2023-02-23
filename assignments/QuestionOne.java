package assignments;

import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numOne;
        double numTwo;
        System.out.println("Enter the First Number");
        numOne= input.nextDouble();
        System.out.println("Enter the Second Number");
        numTwo= input.nextDouble();
        System.out.println("The sum of The Given Numbers is"+sum(numOne,numTwo));
        System.out.println("The difference of The Given Numbers is"+difference(numOne,numTwo));
        System.out.println("The product of The Given Numbers is"+product(numOne,numTwo));
        System.out.println("The quotient of The Given Numbers is"+quotient(numOne,numTwo));


    }
    public static double sum(double numberOne,double numberTwo)
    {
        double sum= numberOne+numberTwo;
        return sum;
    }
    public static  double difference(double numberOne,double numberTwo)
    {
        double difference= numberOne-numberTwo;
        return difference;
    }
    public static double quotient(double numberOne,double numberTwo)
    {
        double quotient= numberOne/numberTwo;
        return quotient;
    }
    public static double product(double numberOne,double numberTwo)
    {
        double product= numberOne*numberTwo;
        return product;
    }

}

