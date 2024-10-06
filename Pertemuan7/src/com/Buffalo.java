package com;

public class Buffalo extends Animal {
    private double hornLength;

    public Buffalo(String name, int age, double hornLength) {
        super(name, age);
        this.hornLength = hornLength;
    }

    @Override
    public void eat() {
        System.out.println(name + " memakan rumput.");
    }

    @Override
    public void move() {
        System.out.println(name + " berjalan perlahan.");
    }

    public void displayBuffaloInfo() {
        displayInfo();
        System.out.println("Panjang tanduk: " + hornLength + " cm");
    }
}
