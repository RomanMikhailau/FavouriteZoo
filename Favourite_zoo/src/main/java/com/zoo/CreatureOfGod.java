package com.zoo;

public abstract class CreatureOfGod {
    private String animalName;
    private String color;
    private String habitat;
    private String foodType;
    private String placeOfZoo;
    private String someFuture;

    public CreatureOfGod(String animalName, String color, String habitat, String placeOfZoo, String foodType) {
        this.animalName = animalName;
        this.color = color;
        this.habitat = habitat;
        this.placeOfZoo = placeOfZoo;
        this.foodType = foodType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getSomeFuture() {
        return someFuture;
    }

    public void setSomeFuture(String someFuture) {
        this.someFuture = someFuture;
    }

    public String getPlaceOfZoo() {
        return placeOfZoo;
    }

    public void setPlaceOfZoo(String placeOfZoo) {
        this.placeOfZoo = placeOfZoo;
    }

    public void informationAboutZoo() {
        System.out.println("\nIt's a " + getAnimalName() + ". " + getAnimalName() + " " + "are usually "
                + getColor() + ". Habitat of animal " + getHabitat() + ", he is a " + getFoodType() + "." + "\n"
                + getSomeFuture() + " In zoo he located in " + getPlaceOfZoo());
    }
}

