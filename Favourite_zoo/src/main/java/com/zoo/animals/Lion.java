package com.zoo.animals;

public class Lion extends Animal {
    public Lion(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Lion is the KING of the best.";
    }

}


