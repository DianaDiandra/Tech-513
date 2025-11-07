package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Exercises_Tests {
	// write unit test(s) for myMethod here
    @ParameterizedTest
    @CsvSource( {"2, 2",
                 "3, 3",
                "99, 99",
            "1000, 1000"})
    @DisplayName("Given equal numbers, myMethod returns false")
    public void givenTwoEqualNumbers_MyMethod_ReturnsFalse(int num1, int num2)
    {
        var result = Exercises.myMethod(num1, num2);
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource( {
            "22, 11",
            "25, 5",
            "121, 11"})
    @DisplayName("Given two divisible numbers, myMethod returns 0")
    public void givenTwoDivisibleNumbers_MyMethod_Returns0(int num1, int num2)
    {
        boolean result = Exercises.myMethod(num1, num2);
        Assertions.assertTrue(result);
    }

   
   @ParameterizedTest
    @ValueSource(ints = {-2, 0, 2, 348})
    @DisplayName("Given an even number, evenOdd returns true")
    public void givenAnEvenNumber_EvenOdd_ReturnsTrue(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertTrue(result);
    }


    @ParameterizedTest
    @ValueSource(ints = {-3, -1, 1, 347})
    @DisplayName("Given an odd number, evenOdd returns false")
    public void givenAnOddNumber_EvenOdd_ReturnsFalse(int x)
    {
        var result = Exercises.evenOdd(x);
        Assertions.assertFalse(result);
    }

	@ParameterizedTest
    @CsvSource( {"3, 4, 13",
                  "-3, 5, -14",
                  "0, 5, 1"})
    @DisplayName("anotherMethod should return correct result")
    public void anotherMethodTest(int x, int y, int expResult){
        var result = Exercises.anotherMethod(x, y);
        Assertions.assertEquals(expResult, result);
    }


    @ParameterizedTest
    @CsvSource( {"I would like a pony, Doesn't start with H",
            "Help, Starts with H",
            "hello, Starts with H"})
    @DisplayName("StringMethod should return correct result")
    public void stringMethodTest(String phrase, String expResult){
        var result = Exercises.stringMethod(phrase);
        Assertions.assertEquals(expResult, result);
    }

    @Test
    @DisplayName("StringMethod should always return correct result")
    public void stringMethodTest(){
        var result = Exercises.stringMethod(null);
        Assertions.assertEquals("Doesn't start with H", result);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 35",
            "5, 11",
            "8, 25",
            "2, 2",
            "12, 47"
    })
    @DisplayName("SumEvenFive should return correct result")
    public void sumEvenFive_ReturnsExpectedResult(int max, int expected) {
        var result = Exercises.sumEvenFive(max);
        Assertions.assertEquals(expected, result,
                "SumEvenFive(" + max + ") should return " + expected);
    }

}

