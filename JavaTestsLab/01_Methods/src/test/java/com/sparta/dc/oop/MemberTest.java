package com.sparta.dc.oop;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class MemberTest {

    private Member sut;

    @BeforeEach
    void setUp(){
        var today = LocalDate.now();
        var joinDate = today.minusDays(45);
        sut   = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        System.out.println("Before Each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Test Method 1");
    }

    @Test
    @DisplayName("getMemberDays returns the correct number of days since joining")
    public void getMemberDaysTest(){
        var result = sut.getMemberDays();
        Assertions.assertEquals(45, result);
    }
    // Write tests for getFirstName, getFullName, getLastName - cover edge cases.
    @Test
    @DisplayName("getFirstName returns the correct first name")
    public void getFirstNameTest() {
        Member sut = new Member("Nish", "Mandal", 2024, 5, 10);
        Assertions.assertEquals("Nish", sut.getFirstName());
    }

    @Test
    @DisplayName("getLastName returns the correct last name")
    public void getLastNameTest() {
        Member sut = new Member("Nish", "Mandal", 2024, 5, 10);
        Assertions.assertEquals("Mandal", sut.getLastName());
    }

    @Test
    @DisplayName("getFullName returns full name correctly")
    public void getFullNameTest() {
        Member sut = new Member("Nish", "Mandal", 2024, 5, 10);
        Assertions.assertEquals("Nish Mandal", sut.getFullName());
    }

    @Test
    @DisplayName("getFullName handles missing first name")
    public void getFullName_missingFirstName() {
        Member sut = new Member("", "Mandal", 2024, 5, 10);
        Assertions.assertEquals("Mandal", sut.getFullName().trim());
    }

    @Test
    @DisplayName("getFullName handles missing last name")
    public void getFullName_missingLastName() {
        Member sut = new Member("Nish", "", 2024, 5, 10);
        Assertions.assertEquals("Nish", sut.getFullName().trim());
    }

    @Test
    @DisplayName("getFullName handles both names missing")
    public void getFullName_bothMissing() {
        Member sut = new Member("", "", 2024, 5, 10);
        Assertions.assertTrue(sut.getFullName().isBlank());
    }

    @Test
    @DisplayName("getMemberDays returns 0 for join date today")
    public void getMemberDays_today() {
        var today = LocalDate.now();
        Member sut = new Member("Nish", "Mandal",
                today.getYear(), today.getMonthValue(), today.getDayOfMonth());
        Assertions.assertEquals(0, sut.getMemberDays());
    }

    @Test
    @DisplayName("getMemberDays handles future join date as negative days")
    public void getMemberDays_futureDate() {
        var future = LocalDate.now().plusDays(10);
        Member sut = new Member("Nish", "Mandal",
                future.getYear(), future.getMonthValue(), future.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertTrue(result < 0, "Expected negative days for future join date");
    }

    @AfterAll
    static void afterAll(){
        System.out.print("After all");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }
}
