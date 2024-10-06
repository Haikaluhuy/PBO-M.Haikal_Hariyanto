package com;

public class Lion extends Animal {
    private String maneColor;

    public Lion(String name, int age, String maneColor) {
        super(name, age);
        this.maneColor = maneColor;
    }

    @Override
    public void eat() {
        System.out.println(name + " memakan daging.");
    }

    @Override
    public void move() {
        System.out.println(name + " berlari dengan gesit.");
    }

    public void displayLionInfo() {
        displayInfo();
        System.out.println("Warna surai: " + maneColor);
    }
}
