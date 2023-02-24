package assignments;

public class Lion extends  Animal{
    private String type ="";

    public Lion(String name,int age, int weight,String eatingType)
    {
        super(name,age,weight,eatingType);
        this.type=setType(weight);
    }
    public String setType(int weight){
        if(weight<250)
        {
            type="Ethiopian";
        }else
            type="African";
        return type;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", eatingType='" + eatingType + '\'' +
                '}';
    }

    public void feed(String name)
    {
        System.out.println(name+"Lion is Feeding from the its own class 30kg per day");
    }
}
