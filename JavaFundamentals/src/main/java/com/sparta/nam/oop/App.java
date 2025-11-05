package com.sparta.nam.oop;

import com.sparta.nam.oop.zoo.Dog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class App {
    public static void main(String[] args) {
//        Member m1 = new Member("Nish", "Mandal", 1999,5,15);
//        Member m2 = new Member("Ahmed", "Hamad", 2001,4,22);
//
//        System.out.println(m1.getFullName());
//        System.out.println(m1.getMemberDays());
//        System.out.println(m2.getFullName());
//        System.out.println(m2.getMemberDays());
//
//        m1.setLastName("Kumar");
//        System.out.println(m1.getFullName());
//
//        Member noel = new Member("Noel", "Gallagher");
//
//
//        BaseballMember nahisah = new BaseballMember("Nahisah", "Nasleem", 2022,12,6, "quarterback");
//        System.out.println(nahisah.getFullName());
//        System.out.println(nahisah.getMemberDays());
//        System.out.println(nahisah.getPosition());
//        nahisah.setPosition("Goalie");
//        System.out.println(nahisah.getPosition());
//        System.out.println();
//        System.out.println(nahisah.toString()); // Baseball Member
//        System.out.println(m1); // Member
//
//
//        ArrayList<Member> members = new ArrayList<>(List.of(m1, m2, nahisah));
//        for(Member member : members){
//            System.out.println(member.toString());
//        }
//
//        Member aiden = new BaseballMember("Aiden", "Farthing", 2022,12,6, "quarterback");
//
//        Dog dog = new Dog("Fido", 2021, 7, 13, "fetch");
//        System.out.println(dog.speak());
//        System.out.println(dog.toString());
//        dog.setName("George");
//        System.out.println("Renamed dog:");
//        System.out.println(dog.toString());

//
//        ArrayList<Movable> movers = new ArrayList<>(List.of(m1,nahisah, dog));
//        for(Movable mover : movers){
//            System.out.println(mover.move());
//        }

//
//        int num1 =5;
//        int num2 = 5;
//        int num3 = num1;
//
//        System.out.println("num1 == num2: " + (num1==num2));
//        System.out.println("num1 == num3: " + (num1==num3));
//
//        num1 = 10;

        Member paul1 = new Member("Paul", "McCartney", 2024,5,22);
        Member paul2 = new Member("Paul", "McCartney", 2024,5,22);
        Member paul3 = paul1;
        System.out.println("m1 == m2: " + (paul1.equals(paul2)));
        System.out.println("m1 == m3: " + (paul1.equals(paul3)));


        System.out.println("paul 1 hashcode: " + paul1.hashCode());
        System.out.println("paul 2 hashcode: " + paul2.hashCode());
        System.out.println("paul 3 hashcode: " + paul3.hashCode());



        HashSet<Integer> setInts = new HashSet<>();
        setInts.add(5);
        setInts.add(5);
        setInts.add(2);
        setInts.add(3);

        HashSet<Member> setMembers = new HashSet<>();
        setMembers.add(paul1);
        setMembers.add(paul2);
        setMembers.add(paul3);
        System.out.println(setMembers);



    }
}
