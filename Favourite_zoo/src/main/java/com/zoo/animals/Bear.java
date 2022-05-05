package com.zoo.animals;

public class Bear extends Animal {
    public Bear(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Bear hero looks like a Russian fairy tale.";
    }


}
