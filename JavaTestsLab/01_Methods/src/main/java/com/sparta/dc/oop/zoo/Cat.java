package com.sparta.dc.oop.zoo;

public class Cat extends Animal {

    private int livesLeft;

    public Cat(String name, int year, int month, int day, int livesLeft) {
        super(name, year, month, day);
        this.livesLeft = livesLeft;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return super.toString() + ", livesLeft=" + livesLeft;
    }

    @Override
    public void move() {
        System.out.println( getName() + " the cat prowls gracefully.");
    }
}
