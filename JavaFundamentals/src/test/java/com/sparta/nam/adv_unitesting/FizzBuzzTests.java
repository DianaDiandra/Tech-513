package com.sparta.nam.adv_unitesting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTests {

    @ParameterizedTest
    @CsvSource({"1, 1", "2,2", "4,4", "7,7", "8,8", "11,11", "13,13", "14,14", "16,16", "17,17", "19,19"})
    @DisplayName("Given a number, return it as a string")
    public void givenNumber_Return_ItsString(int n, String expected){
        assertEquals(expected, FizzBuzzExample.fizzBuzz(n));
    }

    @Test
    @DisplayName("Given 3, return Fizz")
    public void givenThree_Return_Fizz(){
        assertEquals("Fizz", FizzBuzzExample.fizzBuzz(3));
    }

    @ParameterizedTest
    @ValueSource( ints = {3,6,9,12,18})
    @DisplayName("Given a number divisible by 3 but not 5, return Fizz")
    public void givenANumberDivisibleByThreeButNotFive_Return_Fizz(int n){
        assertEquals("Fizz", FizzBuzzExample.fizzBuzz(n));
    }

    @Test
    @DisplayName("Given 5, return Buzz")
    public void givenFive_Return_Buzz(){
        assertEquals("Buzz", FizzBuzzExample.fizzBuzz(5));
    }

    @ParameterizedTest
    @ValueSource( ints = {5,10,20})
    @DisplayName("Given a number divisible by 5 but not 3, return Fizz")
    public void givenANumberDivisibleByFiveButNotThree_Return_Buzz(int n){
        assertEquals("Buzz", FizzBuzzExample.fizzBuzz(n));
    }

    @ParameterizedTest
    @ValueSource( ints = {15,30})
    @DisplayName("Given a number divisible by 15, return FizzBuzz")
    public void givenANumberDivisibleByFifteen_Return_FizzBuzz(int n){
        assertEquals("FizzBuzz", FizzBuzzExample.fizzBuzz(n));
    }
}
