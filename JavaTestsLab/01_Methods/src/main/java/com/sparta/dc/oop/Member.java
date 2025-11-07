package com.sparta.dc.oop;

import com.sparta.dc.oop.zoo.Movable;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Movable {

    private final String firstName;
    private String lastName;
    private final LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinDate = LocalDate.of(year, month, day);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public long getMemberDays(){
        return joinDate.until(LocalDate.now(), ChronoUnit.DAYS);
    }

    @Override
    public void move() {

    }
    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Member member)) return false;
        return Objects.equals(firstName, member.firstName)
                && Objects.equals(lastName, member.lastName)
                && Objects.equals(joinDate, member.joinDate);
    }
}