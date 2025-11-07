package com.sparta.dc.oop.zoo;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CounterTest {

    private static Counter sut;

    @BeforeAll
    static void setupAll(){
        sut = new Counter(6);
    }

    @Test
    @Order(1)
    void decrement_DecrementCountByOne(){
        sut.decrement();
        Assertions.assertEquals(5, sut.getCount());
    }

    @Test
    @Order(2)
    void increment_IncrementCountByOne(){
        sut.increment();
        Assertions.assertEquals(6, sut.getCount());
    }
}
