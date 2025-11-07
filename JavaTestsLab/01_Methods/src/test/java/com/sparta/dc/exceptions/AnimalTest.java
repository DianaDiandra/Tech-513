package com.sparta.dc.exceptions;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AnimalTest {

    @ParameterizedTest
    @CsvSource(
            {
                "0,0",
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
        var exception = assertThrows(IllegalArgumentException.class, () -> sut.setAge(-1));
        Assertions.assertEquals("Age must not be negative: -1", exception.getMessage());
    }

    @ParameterizedTest
    @CsvSource({
            "12 February 2023",
            "15 June 2024"
    })
    @DisplayName("Given an invalid or incorrectly formatted date, setVaccinationDate() throws ParseException")
    void setVaccinationDateSadPath(String invalidDate) {
        Animal sut = new Animal();

        assertThrows(ParseException.class, () -> sut.setVaccinationDate(invalidDate));
    }

    @ParameterizedTest
    @CsvSource({
            "12-02-2023",
            "15-06-2024"
    })
    @DisplayName("Given a valid and correctly formatted date, setVaccinationDate() does not throw ParseException")
    void setVaccinationDateHappyPath(String validDate) {
        Animal sut = new Animal();
        assertDoesNotThrow(() -> sut.setVaccinationDate(validDate));
    }


    @ParameterizedTest
    @CsvSource({
            "Berry, BERRY",
            "Fluffy, FLUFFY"
    })
    @DisplayName("Given a valid name, setName changes the name")
    public void setNameHappyPath(String newName, String expectedName) {
        Animal sut = new Animal();
        sut.setName(newName);
        Assertions.assertEquals(expectedName, sut.getName());
    }

    @Test
    @DisplayName("Given a valid name, setName changes the name")
    public void setNameHappyPath() {
        Animal sut = new Animal();
        sut.setName("Fido");
        Assertions.assertEquals("FIDO", sut.getName());
    }

//    @Test
//    @DisplayName("Given an empty string, setName throws IllegalArgumentException")
//    public void setNameSadPath() {
//        Animal sut = new Animal();
//        assertThrows(IllegalArgumentException.class, () -> sut.setName(" "));
//    }

    @Test
    @DisplayName("Given a null name, setName throws NullPointerException")
    public void setNameSadPath() {
        Animal sut = new Animal();
        assertThrows(NullPointerException.class, () -> sut.setName(null));
    }
}
//Add tests for setName() and setVaccinationDate() for their happy and sad paths.
