package assignments;

public class Tiger extends Animal{
    private String color="";
    public Tiger(String name,int age,int weight,String eatingType,String color)
    {
        super(name,age,weight,eatingType);
        this.color=color;

    }



    public void feed(String name)
    {
        System.out.println(name+" Tiger is Feeding from its own Class 15kg meet per day");
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", eatingType='" + eatingType + '\'' +
                '}';
    }
}
