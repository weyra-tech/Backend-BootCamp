package assignments;

public class Cattle extends Animal{
    boolean mammal;
    String  pName="";
    public Cattle(String name,int age, int weight,String eatingType,boolean mammal)
    {
        super(name,age,weight,eatingType);
        this.mammal=mammal;
        this.pName=setMammal(mammal);
    }

    public String setMammal(boolean mammal)
    {
        if(mammal)
        {
            pName="a cow";
        }
        else
            pName="a bull";
        return pName;
    }

    @Override
    public String toString() {
        return "Cattle{" +
                "mammal=" + mammal +
                ", pName='" + pName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", eatingType='" + eatingType + '\'' +
                '}';
    }
}
