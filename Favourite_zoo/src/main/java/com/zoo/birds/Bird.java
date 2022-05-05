package com.zoo.birds;

import com.zoo.CreatureOfGod;

public class Bird extends CreatureOfGod {
    public Bird(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    public String getBreatheBird() {
        return "Air enters to the bird's body through two nostrils located above the beak.";
    }

    public String getMoveBird() {
        return "Bird moves on the ground on two legs or fly.";
    }
}

