package com.zoo.fishes;

public class Morey extends Fish {
    public Morey(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    @Override
    public String getSomeFuture() {
        return "Morey looks like a scary creature from a scary movie";
    }
}
