package com.sparta;
import java.util.regex.Pattern;

public class Exercises {

    // Question 1 change this method so that it uses the ternary operator ?
    public static String getForecast(int temp) {
        if (temp > 100 || temp < -50) {
            throw new IllegalArgumentException("Temperature out of range");
        }
        return (temp < 15 ?  "It's cold" : "It's hot");
    }

    // Question 2
    // returns the average of the array nums
    public static double average(int[] nums)
    {
        if (nums.length == 0 ) throw new IllegalArgumentException("Array cannot be empty");
        int s = 0;
        for (int i : nums) {
            s += i;
        }
        return (double) s / nums.length;
    }

    // Question 3

    // returns the type of ticket a customer is eligible for based on their age
    // "Standard" if they are between 18 and 59 inclusive
    // "OAP" if they are 60 or over
    // "Student" if they are 13-17 inclusive
    // "Child" if they are 5-12
    // "Free" if they are under 5
    public static String ticketType(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("Invalid Input");
        } else if (age < 5) {
            return "Free";
        } else if (age <= 12) {
            return "Child";
        } else if (age <= 17) {
            return "Student";
        } else if (age <= 59) {
            return "Standard";
        } else {
            return "OAP";
        }
    }

    // Question 4
    public static String grade(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Invalid mark");
        } else if (mark >= 70) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else if (mark >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Question 5
    public static int getScottishMaxWeddingNumber(int covidLevel) {
        return switch (covidLevel) {
            case 0 -> 200;
            case 1 -> 100;
            case 2 -> 50;
            case 3 -> 20;
            default -> throw new IllegalArgumentException("Invalid COVID level: " + covidLevel);
        };
    }
}
