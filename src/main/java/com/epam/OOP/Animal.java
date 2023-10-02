package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {

        String description = "This animal is mostly " + this.color + ". It has " + this.numberOfPaws;

        if (this.numberOfPaws > 1) {
            description += " paws and ";
        } else {
            description += " paw and ";
        }

        if (this.hasFur) {
            return description + "a fur.";
        }

        return description + "no fur.";
    }
}
