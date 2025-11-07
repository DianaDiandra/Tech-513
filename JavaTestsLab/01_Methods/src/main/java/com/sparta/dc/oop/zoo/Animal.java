package com.sparta.dc.oop.zoo;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal implements Movable {

    private String name;
    private final LocalDate birthdate;

    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.birthdate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return Period.between(birthdate, LocalDate.now()).getYears();
    }

    public abstract String speak();

    @Override
    public String toString() {
        return "Animal{name='" + name + "', birthdate=" + birthdate + ", age=" + getAge() + " years}";
    }

    @Override
    public abstract void move();
}
