package com.zoo.fishes;

import com.zoo.CreatureOfGod;

public class Fish extends CreatureOfGod {
    public Fish(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }

    public String getBreatheFish() {
        return "The breathing of fish in water is carried out mainly with the help of gills: water with dissolved " +
                "oxygen passes through the mouth to the gills, where dissolved oxygen is absorbed and enters " +
                "the body";
    }

    public String getMoveFish() {
        return "Fish swims in the water.";
    }
}
