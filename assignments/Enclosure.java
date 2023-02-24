package assignments;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private final List<Animal> herbivoreAnimals = new ArrayList<>();
    private final List<Animal> carnivoreAnimals = new ArrayList<>();

    public void add(final Animal animal) {
        if(animal.eatingType.equals("herbivore"))
        {
            herbivoreAnimals.add(animal);
        }else
            carnivoreAnimals.add(animal);

    }


    @Override
    public String toString() {
        return "Enclosure{" +
                "herbivoreAnimals=" + herbivoreAnimals +
                ", carnivoreAnimals=" + carnivoreAnimals +
                '}';
    }
}
