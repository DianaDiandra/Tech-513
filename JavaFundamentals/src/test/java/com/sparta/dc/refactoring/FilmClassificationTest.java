package com.sparta.dc.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


public class FilmClassificationTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 11})
    @DisplayName("Ages 0-11: should return 'U & PG films are available.")
    public void getClassificationsByAge_Under12_ReturnsUandPG(int age) {
        Assertions.assertEquals(
                "U & PG films are available.",
                FilmClassification.getClassificationsByAge(age)
        );
    }
    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Ages 12–14: should return 'U, PG & 12 films are available.'")
    public void getClassificationsByAge_12To14_ReturnsUpTo12(int age) {
        Assertions.assertEquals("U, PG & 12 films are available.", FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Ages 15–17: should return 'U, PG, 12 & 15 films are available.'")
    public void getClassificationsByAge_15To17_ReturnsUpTo15(int age) {
        Assertions.assertEquals("U, PG, 12 & 15 films are available.", FilmClassification.getClassificationsByAge(age));
    }
    @ParameterizedTest
    @ValueSource(ints = {18, 100})
    @DisplayName("Ages 18 and above: should return 'All films are available.'")
    public void getClassificationsByAge_18Plus_ReturnsAllFilms(int age) {
        Assertions.assertEquals("All films are available.", FilmClassification.getClassificationsByAge(age));
    }
}