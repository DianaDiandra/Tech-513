package com.sparta.nam.oop.zoo;

import com.sparta.nam.oop.Movable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal implements Movable {
    private String name;
    private LocalDate birthDate;

    public Animal(String name, int year, int month, int day) {
        this.name = name;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return (int)birthDate.until(LocalDate.now(), ChronoUnit.YEARS);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                "age='" + getAge() + '\'' +
                '}';
    }

    public abstract String speak();
}
