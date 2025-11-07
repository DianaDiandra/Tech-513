package com.sparta.dc.oop.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DogTests {

    private static final Pattern NAME_PATTERN = Pattern.compile("^[A-Za-z\\s'-]+$");

    @Test
    @DisplayName("Only accepts valid input")
    public void constructorValidInput() {
        Dog dog = new Dog("Buddy", 2020, 5, 15, "Fetch");

        Assertions.assertEquals("Buddy", dog.getName());
        Assertions.assertEquals("Fetch", dog.getFavouriteGame());
        Assertions.assertEquals("Woof!", dog.speak());
        Assertions.assertTrue(dog.getAge() >= 0);

        Matcher matcher = NAME_PATTERN.matcher(dog.getName());
        Assertions.assertTrue(matcher.matches(), "Dog name should match the regex pattern");
    }

    @Test
    @DisplayName("getDogName throws exception for invalid name")
    public void constructorInvalidName() {
        String invalidName = "B@ddy123";

        Matcher matcher = NAME_PATTERN.matcher(invalidName);
        Assertions.assertFalse(matcher.matches(), "Invalid name should not match regex");

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Dog(invalidName, 2020, 5, 15, "Fetch"));
    }

    @Test
    @DisplayName("getDogDays throws exception for future birthdate")
    public void constructorFutureBirthdate() {
        LocalDate future = LocalDate.now().plusYears(1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Dog("Buddy", future.getYear(), future.getMonthValue(), future.getDayOfMonth(), "Fetch"));
    }

    @Test
    @DisplayName("toString includes favourite game info")
    public void toStringIncludesFavouriteGame() {
        Dog dog = new Dog("Rocky", 2018, 6, 12, "Tug of war");
        String result = dog.toString();
        Assertions.assertTrue(result.contains("favouriteGame='Tug of war'"));
    }
}

