package assignments;


public class Animal {
        String name;
        int age;
        int weight;
        String eatingType="";
      public Animal(String name,int age, int weight,String eatingType)
      {
          this.name= name;
          this.age=age;
          this.weight= weight;
          this.eatingType=eatingType;

      }
        public void feed()
        {
            System.out.println("Animal is Feeding from the Parent Class Animal");
        }

}
