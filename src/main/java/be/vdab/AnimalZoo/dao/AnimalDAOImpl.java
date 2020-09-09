package be.vdab.AnimalZoo.dao;

import java.util.ArrayList;
import java.util.List;

import be.vdab.AnimalZoo.model.Animal;
import be.vdab.AnimalZoo.model.AnimalType;
import be.vdab.AnimalZoo.model.FoodType;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalDAOImpl implements AnimalDAO {

    private List<Animal> animals = new ArrayList<>();

    AnimalDAOImpl(){
        Animal animal = new Animal();
        animal.setName("Balou");
        animal.setAnimalType(AnimalType.BEAR);
        animal.setFoodType(FoodType.OMNIVORE);
        animal.setFood("Berries");

        animals.add(animal);
    }

    @Override
    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return null;
    }
    @Override
    public List<Animal> getAllAnimals() {
        return animals;
    }

    @Override
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    @Override
    public void deleteAnimal(String name) {
        animals.remove(findAnimal(name));
    }
}
