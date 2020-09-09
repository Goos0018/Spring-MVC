package be.vdab.AnimalZoo.model;

public class Animal {

    private String name;
    private AnimalType animalType;
    private FoodType foodType;
    private String food;

    // Constructor
    public Animal(AnimalType animalType, String name, FoodType foodType, String food) {
        this.animalType = animalType;
        this.name = name;
        this.foodType = foodType;
        this.food = food;
    }

    public Animal(){}

    //Setters and Getters

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" +
                ", animalType=" + animalType +
                ", name='" + name + '\'' +
                ", foodType=" + foodType +
                ", food='" + food + '\'' +
                '}';
    }
}