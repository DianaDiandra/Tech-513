package com.sparta.dc.oop;

import com.sparta.dc.oop.zoo.Movable;

public class BaseballMember extends Member implements Movable {

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
}
