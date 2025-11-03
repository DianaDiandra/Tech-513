package com.sparta.dc.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AppTest {
//    @Test
//    @DisplayName("My first test")
//    void firstTest(){
//        Assertions.assertTrue(true);
//    }
@Test
@DisplayName("getGreeting() when given time 5 returns 'Good morning!'")
public void getGreeting_GivenTime8_ReturnsGoodMorning() {
    // Arrange
    int time = 5;
    String expected = "Good morning!";

    // Act
    String actual = App.getGreeting(time);

    // Assert
    Assertions.assertEquals(expected, actual);
}

    @Test
    @DisplayName("getGreeting() when given time 14 returns 'Good afternoon!'")
    public void getGreeting_GivenTime14_ReturnsGoodAfternoon() {
        int time = 14;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting() when given time 21 returns 'Good evening!'")
    public void getGreeting_GivenTime21_ReturnsGoodEvening() {
        int time = 21;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("getGreeting() when given time 4 returns 'Good evening!' (before 5am)")
    public void getGreeting_GivenTime4_ReturnsGoodEvening() {
        int time = 4;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Boundary test: 12 should return 'Good afternoon!'")
    public void getGreeting_BoundaryAt12_ReturnsGoodAfternoon() {
        int time = 12;
        String expected = "Good afternoon!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Boundary test: 18 should return 'Good evening!'")
    public void getGreeting_BoundaryAt18_ReturnsGoodEvening() {
        int time = 18;
        String expected = "Good evening!";
        String actual = App.getGreeting(time);
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {5,11})
    @DisplayName("getGreeting, when given a time from 5 to 11, returns good morning")
    public void getGreeting_GivenATimeFrom5to11_ReturnsGoodMorning(int time){
        Assertions.assertEquals("Good morning!", App.getGreeting(time));
    }

    @ParameterizedTest
    @CsvSource({
            "Good evening!, 2",
            "Good morning!, 8",
            "Good afternoon!, 15",
            "Good evening!, 12"
    })
    @DisplayName("getGreeting, when given a time, returns appropriate greeting")
    public void givenATime_Greeting_ReturnsAnAppropriateGreeting(String greeting, int time){
        Assertions.assertEquals(greeting, App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 4})
    @DisplayName("getGreeting, when given a time from 0 to 4, returns good evening")
    void getGreeting_GivenATimeFrom0to4_ReturnsGoodEvening(int time) {
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {12,18})
    @DisplayName("getGreeting, when given a time from 12 to 18, returns good afternoon")
    public void getGreeting_GivenATimeFrom12to18_ReturnsGoodAfternoon(int time){
        Assertions.assertEquals("Good afternoon!", App.getGreeting(time));
    }

    @ParameterizedTest
    @ValueSource(ints = {19, 23})
    @DisplayName("getGreeting, when given a time from 19 to 23, returns good evening")
    void getGreeting_GivenATimeFrom19to23_ReturnsGoodEvening(int time) {
        Assertions.assertEquals("Good evening!", App.getGreeting(time));
    }

}
