package assignments;

public class QuestionTwo {
    public static void main(String[] args) {
        String name = "Atirsaw";
        int age =32;
        double salary= 15000;


        String str1=String.format("Age:"+"[%d]",age);
        String str2=String.format("Name:"+"[%s]",name);
        String str3=String.format("Salary:"+"[%s]",salary);
        System.out.print('"'+str2+","+str1+","+str3 +'"');


    }
}
