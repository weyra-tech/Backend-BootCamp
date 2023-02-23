package assignments;

class Rectangle{
    double length;
    double width;


    public double area(double length,double width){
        return length*width;
    }
}

public class QuestionSeven {
    public static void main(String[] args) {
        Rectangle newRectangle= new Rectangle();
        System.out.println("The area of the rectangle is "+ newRectangle.area(5,6));
    }
}
