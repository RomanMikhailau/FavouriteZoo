package com.zoo.animals;

import com.zoo.CreatureOfGod;

public class Animal extends CreatureOfGod {
    public Animal(String animalName, String color, String habitat, String placeOfZoo,
                  String foodType) {
        super(animalName, color, habitat, placeOfZoo, foodType);
    }


    public String getBreatheAnimal() {
        return "Oxygen in animals enters through the nasal passages and passes into the nasal cavity.";
    }

    public String getMoveAnimal() {
        return "Animal moves on the ground on two or four legs";
    }
}

