package com.sparta.nam.oop;

public class App {
    public static void main(String[] args) {
        Member m1 = new Member("Nish", "Mandal", 1999,5,15);
        Member m2 = new Member("Ahmed", "Hamad", 2001,4,22);

        System.out.println(m1.getFullName());
        System.out.println(m1.getMemberDays());
        System.out.println(m2.getFullName());
        System.out.println(m2.getMemberDays());

        m1.setLastName("Kumar");
        System.out.println(m1.getFullName());

        Member noel = new Member("Noel", "Gallagher");


        BaseballMember nahisah = new BaseballMember("Nahisah", "Nasleem", 2022,12,6, "quarterback");
        System.out.println(nahisah.getFullName());
        System.out.println(nahisah.getMemberDays());
        System.out.println(nahisah.getPosition());
        nahisah.setPosition("Goalie");
        System.out.println(nahisah.getPosition());




    }
}
