package com.sparta.dc.oop.zoo;

import java.time.LocalDate;
import java.util.Objects;

public class Dog extends Animal {

    private String favouriteGame;

    public Dog(String name, int year, int month, int day, String favouriteGame) {
        super(validateName(name), validateDate(year, month, day).getYear(),
                validateDate(year, month, day).getMonthValue(),
                validateDate(year, month, day).getDayOfMonth());
        this.favouriteGame = favouriteGame;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + ", favouriteGame='" + favouriteGame + "'";
    }

    // --- Validation methods ---

    private static String validateName(String name) {
        if (!name.matches("^[A-Za-z\\s'-]+$")) {
            throw new IllegalArgumentException("Invalid name: " + name);
        }
        return name;
    }

    private static LocalDate validateDate(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        if (date.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birthdate cannot be in the future: " + date);
        }
        return date;
    }
    @Override
    public void move() {
        System.out.println(getName() + " the dog is running");
    }


    @Override
    public boolean equals(Object i) {
        if (this == i) return true; //same reference type
        if (!(i instanceof Dog)) return false;
        Dog dog = (Dog) i;
        return Objects.equals(favouriteGame, dog.favouriteGame);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favouriteGame);
    }
}
