package assignments;

public class Bear extends  Animal{

    private String type =" ";
    public Bear(String name,int age, int weight,String eatingType,String type)
    {
        super(name,age,weight,eatingType);
        this.type=type;
    }

    public void feed(String name)
    {
        System.out.println(name+"Bear is Feeding from its own class 20kg meat and  5 kg fish per day");
    }

    @Override
    public String toString() {
        return "Bear{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", eatingType='" + eatingType + '\'' +
                '}';
    }
}
