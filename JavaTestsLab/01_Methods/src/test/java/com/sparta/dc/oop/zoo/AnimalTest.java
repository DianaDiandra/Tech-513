package com.sparta.dc.oop.zoo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AnimalTest {

    @Test
    @DisplayName("getName and setName work correctly")
    public void testGetNameAndSetName() {
        Animal dog = new Dog("Buddy", 2020, 5, 10, "Fetch");
        Assertions.assertEquals("Buddy", dog.getName());

        dog.setName("Rex");
        Assertions.assertEquals("Rex", dog.getName());
    }

    @Test
    public void testGetAge() {
        LocalDate today = LocalDate.now();
        Animal cat = new Cat("Whiskers", today.getYear() - 5, today.getMonthValue(), today.getDayOfMonth(), 9);
        Assertions.assertEquals(5, cat.getAge());
    }

    @Test
    public void testInvalidNameThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Dog("123Invalid!", 2020, 5, 10, "Fetch")
        );
    }

    @Test
    public void testFutureBirthdateThrowsException() {
        LocalDate future = LocalDate.now().plusDays(1);
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                new Cat("Fluffy", future.getYear(), future.getMonthValue(), future.getDayOfMonth(), 9)
        );
    }
}
