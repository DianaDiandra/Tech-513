package com.sparta.nam.oop;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println();
        System.out.println(nahisah.toString()); // Baseball Member
        System.out.println(m1); // Member


        ArrayList<Member> members = new ArrayList<>(List.of(m1, m2, nahisah));
        for(Member member : members){
            System.out.println(member);
        }

        Member aiden = new BaseballMember("Aiden", "Farthing", 2022,12,6, "quarterback");




    }
}
