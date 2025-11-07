package Exercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoreExercises {

//    Given an array of integers, convert them to a single int made up of the digits
    public static int concatNum(String numbers) {
        String concatenated = Arrays.stream(numbers.split(","))
                .map(String::trim)
                .reduce("" , (a,b) -> a + b);
        return Integer.parseInt(concatenated);
    }
}
