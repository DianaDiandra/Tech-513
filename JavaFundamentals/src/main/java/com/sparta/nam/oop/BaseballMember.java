package com.sparta.nam.oop;

public class BaseballMember extends Member  {

    private String position;
    public BaseballMember(String firstName, String lastName, int year, int month, int day, String position){
        super(firstName, lastName, year, month, day);
        this.position = position;
    }

    public String getPosition() {
        return position;

    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + " position: " + position;
    }

    @Override
    public String move() {
        return "I am moving as a baseball member";
    }
}
