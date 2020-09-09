package be.vdab.AnimalZoo.dao;

import be.vdab.AnimalZoo.model.Animal;

import java.util.List;

public interface AnimalDAO {
    List<Animal> getAllAnimals();

    void addAnimal(Animal animal);
    Animal findAnimal(String name);
    void deleteAnimal(String name);
}
