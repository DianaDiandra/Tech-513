package com.sparta.dc.Exercises;

import Exercises.StringExercises;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringExercisesTests {
    @ParameterizedTest
    @CsvSource({
            "'The,cat,in,the,hat', t, 2",
            "'Apple,Ant,arc,ball', a, 3",
            "'Dog,cat,Fish', f, 1",
            "'One,Two,Three', z, 0"
    })
    @DisplayName("CountWords should return correct count regardless of case")
    void countWords_ReturnsExpected(String csvWords, char ch, int expected) {
        String[] words = csvWords.split(",");
        int result = StringExercises.countWords(words, ch);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("CountWords should throw IllegalArgumentException when array is null")
    void countWords_ThrowsOnNullArray() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringExercises.countWords(null, 'a');
        });
    }

    @ParameterizedTest
    @CsvSource({
            "'The,cat,in,the,hat', t, 2",
            "'Apple,Ant,arc,ball', a, 3",
            "'Dog,cat,Fish', f, 1",
            "'One,Two,Three', z, 0"
    })
    @DisplayName("CountWords should return correct count regardless of case")
    void countWordsInString_ReturnsExpected(String csvPhrase, char ch, int expected) {
        int result = StringExercises.countWordsInString(csvPhrase, ch);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("countWordsInString throws exception when input string is null")
    void countWordsInString_ThrowsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringExercises.countWordsInString(null, 'z');
        });
    }

    @Test
    @DisplayName("countWordsInString handles multiple spaces correctly")
    void countWordInString_HandlesExtraSpace() {
        String phrase = " The      black   cat    ";
        int result = StringExercises.countWordsInString(phrase, 'a');
        Assertions.assertEquals(0, result);
    }

    @ParameterizedTest
    @CsvSource({
            "'  Cathy', 10, CATHY0123456789",
            "'', 4, 0123",
            "' Piano  ', 12, PIANO01234567891011"
    })
    @DisplayName("stringTransformations should format correctly for given inputs")
    void stringTransformations_ReturnsExpected(String input, int number, String expected) {
        String result = StringExercises.stringTransformations(input, number);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "madam, true",
            "civic, true",
            "Civic, true",
            "hello, false",
            "RaceCar, true",
            "'', false",
            "'  ', false"
    })
    @DisplayName("isPalindrome should correctly identify palindromes")
    void palindromeString_ReturnsExpected(String input, boolean expected) {
        boolean result = StringExercises.palindromeString(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("isPalindrome should return false for null")
    void palindromeString_NullInput_ReturnsFalse() {
        Assertions.assertFalse(StringExercises.palindromeString(null));
    }
}
