package com.sparta.nam.oop;

public class Counter {

    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment(){count++;}
    public void decrement(){count--;}

    public int getCount(){return count;}
}
