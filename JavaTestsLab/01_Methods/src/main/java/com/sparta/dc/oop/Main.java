package com.sparta.dc.oop;

import com.sparta.dc.oop.zoo.Animal;
import com.sparta.dc.oop.zoo.Dog;
import com.sparta.dc.oop.zoo.Movable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Movable> movables = new ArrayList<>();

        movables.add(new Member("Nish", "Mandal", 1989, 11, 3));
        movables.add(new Member("Bob", "Lenny", 1978, 02, 12));

        for (Movable item : movables) {
            item.move();
        }

        Dog d1 = new Dog("Rex", 2023, 2, 28, "Fetch");
        Dog d2 = new Dog("Rex", 2023, 2, 28, "Fetch"); // same favouriteGame → equal
        Dog d3 = d1; // same reference

        Set<Dog> dogs = new HashSet<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        System.out.println("\n=== Dog HashSet Test ===");
        System.out.println("Number of dogs in set: " + dogs.size());
        for (Dog d : dogs) {
            d.move();
        }
    }
}

