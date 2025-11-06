package com.sparta.nam.oop;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class MemberTests {

    private Member sut;
    @BeforeEach
    void setUp(){
        var today = LocalDate.now();
        var joinDate = today.minusDays(45);
        sut   = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        System.out.println("Before Each");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before All");
    }


    @Test
    @DisplayName("getMemberDays returns the correct number of days since joining")
    public void getMemberDaysTest(){
;       Assertions.assertEquals(45, sut.getMemberDays());
        System.out.println("Test Method 1");
    }


    @Test
    @DisplayName("getFullName returns the correct full name of the member")
    public void getFullName(){
        Assertions.assertEquals("Nish Mandal", sut.getFullName());
        System.out.println("Test Method 2");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("After All");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After Each");
    }


    // Write tests for getFirstName, getFullName, getLastName - cover edge cases.
}
