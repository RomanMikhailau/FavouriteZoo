package com.zoo.birds;

public class Parrot extends Bird {
    public Parrot(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Parrot is a big lover to speak human language";
    }
}
