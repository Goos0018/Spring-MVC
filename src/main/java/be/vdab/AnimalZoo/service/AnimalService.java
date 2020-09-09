package be.vdab.AnimalZoo.service;

import be.vdab.AnimalZoo.model.Animal;

import java.util.List;

public interface AnimalService {

    List<Animal> getAllAnimals();
    void addAnimal(Animal animal);
    Animal getAnimalByName(String name);
    void deleteAnimalByName(String name);
}
