package com.sparta.dc.oop.zoo;

import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Fido", 2020, 3, 10, "Fetch"));
        animals.add(new Dog("Buddy", 2019, 5, 25, "Tug of war"));
        animals.add(new Cat("Whiskers", 2018, 7, 1, 9));
        animals.add(new Cat("Mittens", 2021, 9, 15, 8));

        System.out.println("\n--- Zoo Animals ---");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " says: " + animal.speak());
            System.out.println(animal);
            System.out.println("---------------------------");
        }
    }
}
