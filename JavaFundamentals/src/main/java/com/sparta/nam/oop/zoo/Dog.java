package com.sparta.nam.oop.zoo;

public class Dog extends Animal {
    private String favouriteGame;

    public Dog(String name, int year, int month, int day, String favouriteGame) {
        super(name, year, month, day);
        this.favouriteGame = favouriteGame;
    }

    @Override
    public String speak() {
        return "woof, woof";
    }

    @Override
    public String toString() {
        return super.toString() + " favourite game: " + favouriteGame;
    }

    @Override
    public String move() {
        return "I am moving woof woof";
    }
}