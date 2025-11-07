package com.sparta.dc.Exercises;

import Exercises.MoreExercises;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static Exercises.MoreExercises.concatNum;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MoreExercisesTests {
    @ParameterizedTest
    @CsvSource({
            "'1,3,6,7,9', 13679",
            "'9,6,4,2,3,1', 964231",
            "'0,1,2,3,4', 1234"
    })
    @DisplayName("concatNum should convert a comma-separated string into one concatenated integer")
    void concatNum_ReturnsExpected(String csvInput, int expected) {
        int result = MoreExercises.concatNum(csvInput);
        assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "' '",
            "''",
            "null"
    })
    @DisplayName("concatNum should throw IllegalArgumentException for null or empty input")
    void concatNum_ThrowsExceptionForInvalidInput(String invalidInput) {
        assertThrows(IllegalArgumentException.class, () -> MoreExercises.concatNum(invalidInput));
    }
}
