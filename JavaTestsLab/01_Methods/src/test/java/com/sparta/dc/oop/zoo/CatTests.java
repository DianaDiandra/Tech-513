package com.sparta.dc.oop.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CatTests {

    @Test
    @DisplayName("Check that name, birthdate, and livesLeft are stored correctly")
    public void CredentialsTest() {
        Cat cat = new Cat("Mittens", 2018, 8, 15, 9);

        Assertions.assertEquals("Mittens", cat.getName());
        Assertions.assertEquals(9, cat.getLivesLeft());
        int expectedAge = LocalDate.now().getYear() - 2018;
        Assertions.assertEquals(expectedAge, cat.getAge());
    }

    @Test
    @DisplayName("Getter and setter for livesLeft work correctly")
    public void livesLeftGetterSetterTest() {
        Cat cat = new Cat("Fluffy", 2020, 5, 10, 7);
        Assertions.assertEquals(7, cat.getLivesLeft());

        cat.setLivesLeft(5);
        Assertions.assertEquals(5, cat.getLivesLeft());
    }

    @Test
    @DisplayName("toString contains livesLeft and name info")
    public void toStringTest() {
        Cat cat = new Cat("Whiskers", 2019, 3, 20, 8);
        String output = cat.toString();

        Assertions.assertTrue(output.contains("Whiskers"));
        Assertions.assertTrue(output.contains("livesLeft=8"));
    }

    @Test
    @DisplayName("Age calculation works correctly")
    public void getAgeTest() {
        Cat cat = new Cat("Tiger", 2022, 1, 1, 9);
        int expectedAge = LocalDate.now().getYear() - 2022;
        Assertions.assertEquals(expectedAge, cat.getAge());
    }
}
