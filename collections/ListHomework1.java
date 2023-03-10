package collections;


/*
Create a Java program that allows a user to perform various operations on an ArrayList of integers.
The program should display a menu of options, and the user should be able to select one of the following operations:
1. Add an element to the list
2. Remove an element from the list
3. Find the minimum element in the list
4. Find the maximum element in the list
5. Print the contents of the list
6. Quit the program

The program should continue to display the menu and allow the user to perform operations until they choose to quit.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ListHomework1 {


    ArrayList<Integer> arrayList = new ArrayList<Integer>(
            Arrays.asList(3,6,9));
    Iterator itr = arrayList.iterator();
    public  void addElement(int element)
    {
       arrayList.add(element);

    }
    public  void removeElement(int element)
    {

        // Holds true till there is single element
        // remaining in the object
        while (itr.hasNext()) {

            // Iterator.remove()
            if (element == (Integer)itr.next())
                itr.remove();
        }

        // Printing the updated ArrayList
        System.out.print(arrayList);

    }
    public int minElement()
    {
        int min= arrayList.get(0);
        while (itr.hasNext()){
            if((Integer)itr.next()<min)
            {
                min=(Integer)itr.next();
            }
        }
        return  min;

    }
    public int maxElement()
    {
        int max= arrayList.get(0);
        while (itr.hasNext()){
            if((Integer)itr.next()>max)
            {
                max=(Integer)itr.next();
            }
        }
        return  max;

    }
    public void displayElements()
    {
        System.out.println("The Elements of the ArrayList are \t"+arrayList);
    }

    public void quitProgram()
    {
        System.exit(0);

    }
    public static void main(String[] args) {
        ListHomework1 listHomework1= new ListHomework1();
        Scanner input= new Scanner(System.in);

        int  opcode;

        System.out.println("Program for ArrayLis Manipulation\n");

        while (true)

        {
            System.out.print("Enter Your Choice:\n " +
                    "1 -> for Adding Element\n" +
                    "2 -> for Removing Element\n"+
                    "3 -> for getting Minimum Element\n" +
                    "4 -> for getting Maximum Element\n" +
                    "5 -> for displaying Elements\n" +
                    "6 -> for Quitting The Program\n");

            opcode = input.nextInt();

            switch (opcode)

            {
                case 1:
                    System.out.println("Enter the Element You Want to Add");
                    int element= input.nextInt();

                     listHomework1.addElement(element);

                     System.out.format("Your Element is Successfully Added to the List");

                    break;

                case 2:

                    System.out.println("Enter the Element You Want to remove");
                    int elementToRemove= input.nextInt();

                    listHomework1.removeElement(elementToRemove);

                    System.out.format("Your Element is Successfully Removed from the List\n");

                    break;


                case 3:

                    int minElement=listHomework1.minElement();

                    System.out.format("The Minimum Element in The List is \t"+minElement);

                    break;


                case 4:

                    int maxElement=listHomework1.maxElement();

                    System.out.format("The Maximum Element in The List is \t"+maxElement);

                    break;

                case 5:

                    listHomework1.displayElements();
                    break;
                case 6:

                    listHomework1.quitProgram();
                    break;

                default:
                    System.out.println("Trying to Perform Invalid Operation");
                    break;

            }

        }

    }

}










