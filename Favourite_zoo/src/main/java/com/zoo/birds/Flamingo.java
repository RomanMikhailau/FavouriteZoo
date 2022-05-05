package com.zoo.birds;

public class Flamingo extends Bird {
    public Flamingo(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }
    @Override
    public String getSomeFuture() {
        return "Flamingos have very long and thin legs.";
    }
}
