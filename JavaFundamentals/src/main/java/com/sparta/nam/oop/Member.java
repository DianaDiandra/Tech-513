package com.sparta.nam.oop;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Member implements Movable, Talkable {

    protected final String firstName;
    private String lastName;
    private LocalDate joinDate;

    public Member(String firstName, String lastName, int year, int month, int day) {
        this(firstName, lastName);
        this.joinDate = LocalDate.of(year, month, day);
    }

    public Member(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
    public String toString() {
        return getFullName() + " has been a member for " +getMemberDays() + " days.";
    }

    public static int add(int a, int b){
        return a + b;
    }

    @Override
    public String move() {
        return "I am moving as a Member";
    }

    @Override
    public String talk() {
        return "Hello";
    }

    @Override
    public boolean equals(Object obj) {
        if(! (obj instanceof Member member)) return false;
        return Objects.equals(firstName, member.firstName)
                && Objects.equals(lastName, member.lastName)
                && Objects.equals(joinDate, member.joinDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, joinDate);
    }
}
