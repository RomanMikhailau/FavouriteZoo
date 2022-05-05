package com.zoo.animals;

public class Wolf extends Animal {
    public Wolf(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Wolf is a forest nurse.";
    }
}


