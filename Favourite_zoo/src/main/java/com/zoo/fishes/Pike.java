package com.zoo.fishes;

public class Pike extends Fish {
    public Pike(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Pike is a major freshwater predator";
    }
}
