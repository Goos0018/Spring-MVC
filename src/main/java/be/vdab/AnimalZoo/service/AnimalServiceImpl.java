package be.vdab.AnimalZoo.service;

import java.util.List;

import be.vdab.AnimalZoo.dao.AnimalDAO;
import be.vdab.AnimalZoo.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnimalServiceImpl implements AnimalService {

    @Autowired
    AnimalDAO animalDAO;

    @Override
    public List<Animal> getAllAnimals() {
        return animalDAO.getAllAnimals();
    }

    @Override
    public void addAnimal(Animal animal) {
        animalDAO.addAnimal(animal);
    }

    @Override
    public Animal getAnimalByName(String name) {
        return animalDAO.findAnimal(name);
    }

    @Override
    public void deleteAnimalByName(String name) {
        animalDAO.deleteAnimal(name);
    }
}
