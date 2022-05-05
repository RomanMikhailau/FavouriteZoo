package com.zoo.fishes;

public class LionFish extends Fish {
    public LionFish(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Lion fish is a relative of the wart, the most ugly fish from this family";
    }
}
