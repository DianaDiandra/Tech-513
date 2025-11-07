package com.sparta;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Exercises_Tests {
    @Test
    @DisplayName("Given a temperature less than 15, getForecast returns It's cold")
    public void getForecast_Cold() {
        assertEquals("It's cold", Exercises.getForecast(14) );
    }

    @Test
    @DisplayName("Given a temperature of 15, getForecast returns It's hot")
    public void getForecast_Hot() {
        assertEquals("It's hot", Exercises.getForecast(15) );
    }

    @Test
    @DisplayName("Given a temperature over 100, getForecast throws an exception")
    public void getForecast_TooHigh_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Exercises.getForecast(125);
        });
    }

    @Test
    @DisplayName("Average returns correct average")
    public void Average_ReturnsCorrectAverage()
    {
        int[] nums = { 3, 8, 1, 7, 3 };
        assertEquals(4.4, Exercises.average(nums));
    }

    @Test
    @DisplayName(("When the Array is empty average throws error"))
    public void WhenArrayIsEmpty_Average_ThrowsException()
    {
        int[] nums = {  };

        assertThrows(IllegalArgumentException.class, () -> {
            Exercises.average(nums);
        });
    }

    @ParameterizedTest
    @CsvSource({
            "100, OAP",
            "60, OAP",
            "59, Standard",
            "18, Standard",
            "17, Student",
            "13, Student",
            "12, Child",
            "5, Child",
            "4, Free",
            "0, Free"
    })
    @DisplayName("Testing ticket types by valid ages")
    public void TicketTypeValidAgesTest(int age, String expected) {
        String result = Exercises.ticketType(age);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "189",
            "-5"
    })
    @DisplayName("Testing ticket types by invalid ages")
    public void TicketTypeInvalidAgesTest(int age) {
        assertThrows(IllegalArgumentException.class, () -> Exercises.ticketType(age));
    }

    // write unit tests for the 'Grade' method here
    @ParameterizedTest
    @CsvSource({
            "85,A",
            "70,A",
            "65,B",
            "60,B",
            "55,C",
            "50,C",
            "45,D",
            "40,D",
            "20,F",
            "0,F"
    })
    @DisplayName("Test for numeric grade mapping")
    public void gradeParameterizedTest(int mark, String expectedGrade) {
        assertEquals(expectedGrade, Exercises.grade(mark));
    }

    @ParameterizedTest
    @CsvSource({
            "-5",
            "101",
            "200"
    })
    @DisplayName("Test for invalid numeric grades")
    public void gradeInvalidMarksTest(int mark) {
        assertThrows(IllegalArgumentException.class, () -> Exercises.grade(mark));
    }

    // write unit tests for the Scottish wedding example here
    @ParameterizedTest
    @CsvSource({
            "0,200",
            "1,100",
            "2,50",
            "3,20",
            "4,0",
    })
    @DisplayName("getScottishMaxWeddingNumber check valid input")
    public void maxNumberParameterizedTest(int covidLevel, int expectedNumber) {
    assertEquals(expectedNumber, Exercises.getScottishMaxWeddingNumber(covidLevel));
    }

    @ParameterizedTest
    @CsvSource({
            "4",
            "-1",
            "10"
    })
    @DisplayName("getScottishMaxWeddingNumber check invalid input throws exception")
    public void maxNumberInvalidTest(int covidLevel) {
        assertThrows(IllegalArgumentException.class, () -> Exercises.getScottishMaxWeddingNumber(covidLevel));
    }
}
