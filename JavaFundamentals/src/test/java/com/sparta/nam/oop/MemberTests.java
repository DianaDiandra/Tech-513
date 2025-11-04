package com.sparta.nam.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class MemberTests {

    @Test
    @DisplayName("getMemberDays returns the correct number of days since joining")
    public void getMemberDaysTest(){
        var today = LocalDate.now();
        var joinDate = today.minusDays(45);
        Member sut   = new Member("Nish", "Mandal", joinDate.getYear(), joinDate.getMonth().getValue(), joinDate.getDayOfMonth());
        var result = sut.getMemberDays();
        Assertions.assertEquals(45, result);
    }

    // Write tests for getFirstName, getFullName, getLastName - cover edge cases.
}
