package com.zoo;

import com.zoo.animals.Bear;
import com.zoo.animals.Lion;
import com.zoo.animals.Wolf;
import com.zoo.birds.Flamingo;
import com.zoo.birds.Parrot;
import com.zoo.birds.Toucan;
import com.zoo.fishes.LionFish;
import com.zoo.fishes.Morey;
import com.zoo.fishes.Pike;

public class ZooGroup {
    Lion lion = new Lion("Lion", "Yellow", "jungle", "aviary", "Predator");
    Bear bear = new Bear("Bear", "brown", "forest", "aviary", "omnivorous");
    Wolf wolf = new Wolf("Wolf", "grey", " forest", "aviary", "omnivorous");
    Flamingo flamingo = new Flamingo("Flamingo", "Pink", "Lake", "aviary",
            "predator");
    Parrot parrot = new Parrot("Parrot Cockatoo", "colorful", "forest", "cage",
            "herbivorous");
    Toucan toucan = new Toucan("Toucan", "colorful", "forest", "cage",
            "omnivorous");
    LionFish lionFish = new LionFish("Lion Fish", "colorful", "Ocean", "aquarium",
            "herbivorous");
    Morey morey = new Morey("Morey", "greenish-yellow", "Sea", "aquarium",
            "predator");
    Pike pike = new Pike("Pike", "gray-brown", "Sea", "aquarium",
            "predator");
}
