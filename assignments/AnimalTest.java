package assignments;

public class AnimalTest {
    public static void main(String[] args) {
        Lion newLion = new Lion("Tateke",25,250,"carnivore");
        System.out.println(newLion.toString());
        // realizing method overloading type of polymorphism
        newLion.feed();// it will call the method in parent class
        newLion.feed(newLion.name);// this will call a method in its own class...


        Tiger newTiger = new Tiger("Gartya",15,120,"carnivore","golden");
        System.out.println(newTiger.toString());
        // realizing method overloading type of polymorphism
        newTiger.feed();// it will call the method in parent class
        newTiger.feed(newTiger.name);// this will call a method in its own class...

        Bear newBear = new Bear("putin",35,350,"carnivore","Russian");
        System.out.println(newBear.toString());
        // realizing method overloading type of polymorphism
        newBear.feed();// it will call the method in parent class
        newBear.feed(newBear.name);// this will call a method in its own class...


        Cattle newCattle = new Cattle("medrealem",20,300,"herbivore",true);
        System.out.println(newCattle.toString());
        // realizing method overloading type of polymorphism
        newCattle.feed();// it will call the method in parent class
        // Testing the Enclosure Class.
        Enclosure newEnclosure = new Enclosure();
        newEnclosure.add(newLion);
        newEnclosure.add(newBear);
        newEnclosure.add(newTiger);
        newEnclosure.add(newCattle);
        System.out.println(newEnclosure.toString());


    }
}
