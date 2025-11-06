package com.sparta.nam.exceptions;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;

public class AnimalTests {

    @ParameterizedTest
    @CsvSource(
            {"0,0",
            "10,10"
            })
    @DisplayName("Given an age of 0 or above, setAge changes the age")
    public void setAgeHappyPath(int newAge, int expectedAge){
        Animal sut = new Animal();
        sut.setAge(newAge);
        Assertions.assertEquals(expectedAge, sut.getAge());
    }

    @Test
    @DisplayName("Given an age of 0 or above, setAge throws an Exception")
    public void setAgeSadPath(){
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(IllegalArgumentException.class, () -> sut.setAge(-1));
        Assertions.assertEquals("Age must not be negative: -1", exception.getMessage());
    }

    @Test
    @DisplayName("Given string, setName changes the name")
    public void setNameHappyPath()  {
        Animal sut = new Animal();
        sut.setName("Spike");
        Assertions.assertEquals("SPIKE", sut.getName());
    }

    @Test
    @DisplayName("Given null, setName throws a NullPointerException")
    public void setNameSadPath() {
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(NullPointerException.class, () -> sut.setName(null));
        Assertions.assertEquals("'name' cannot be 'null'"  , exception.getMessage());
    }

    @Test
    @DisplayName("Given a string with the correct format, setVaccinationDate changes the date")
    public void setDateHappyPath() throws ParseException {
        Animal sut = new Animal();
        sut.setVaccinationDate("27-07-2022");
        var newDate = sut.getVaccinationDate();
        Assertions.assertEquals("Wed Jul 27 00:00:00 BST 2022", newDate.toString());
    }

    @Test
    @DisplayName("Given a string with incorrect format, setVaccinationDate throws a ParseException")
    public void setDateSadPath() {
        Animal sut = new Animal();
        var exception = Assertions.assertThrows(ParseException.class, () -> sut.setVaccinationDate("not a valid date"));
        Assertions.assertEquals("Unparseable date: \"not a valid date\""  , exception.getMessage());
    }
}
