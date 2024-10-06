package com;

public class Pigeon extends Animal {
    private String breed;

    public Pigeon(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(name + " mematuk biji-bijian.");
    }

    @Override
    public void move() {
        System.out.println(name + " terbang rendah dan cepat.");
    }

    public void displayPigeonInfo() {
        displayInfo();
        System.out.println("Jenis: " + breed);
    }
}
