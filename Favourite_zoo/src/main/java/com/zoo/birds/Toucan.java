package com.zoo.birds;

public class Toucan extends Bird {
    public Toucan(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Toucan has a very large and heavy beak";
    }
}
