package com.sparta.dc.oop;

import java.util.HashSet;

public class App {

    public static void main(String[] args) {
        Member m1 = new Member("Nish", "Mandal", 1999, 5, 15);
        Member m2 = new Member("Ahmed", "Hamad", 2001, 4, 22);

        System.out.println(m1.getFullName());
        System.out.println(m1.getMemberDays());
        System.out.println(m2.getFullName());
        System.out.println(m2.getMemberDays());

        m1.setLastName("Kumar");
        System.out.println(m1.getFullName());

        Member noel = new Member("Noel", "Gallagher", 1997, 7, 30);

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



