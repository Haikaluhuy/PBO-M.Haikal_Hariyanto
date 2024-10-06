package com;

public class Eagle extends Animal {
    private double wingspan;

    public Eagle(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    @Override
    public void eat() {
        System.out.println(name + " memangsa hewan kecil.");
    }

    @Override
    public void move() {
        System.out.println(name + " terbang tinggi di langit.");
    }

    public void displayEagleInfo() {
        displayInfo();
        System.out.println("Lebar sayap: " + wingspan + " cm");
    }
}
