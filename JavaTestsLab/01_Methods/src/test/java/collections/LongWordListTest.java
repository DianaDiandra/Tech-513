package collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongWordListTest {
    @Test
    @DisplayName("Finds words with 5 or more letters")
    public void findsWordsWithCorrectLength() {
        String sentence = "The quick brown fox is running after the mouse";
        List<String> expected = Arrays.asList("quick", "brown", "running", "after", "mouse");
        assertEquals(expected, LongWordList.longWordListExercise(sentence));
    }

    @Test
    @DisplayName("Returns empty list when no words are long enough")
    public void returnsEmptyListWhenNoLongWords() {
        String sentence = "I have a cat";
        List<String> expected = List.of();

        assertEquals(expected, LongWordList.longWordListExercise(sentence));
    }

    @Test
    @DisplayName("Includes duplicate long words as they appear")
    public void includesDuplicatesInOrder() {
        String sentence = "Hello Hello again again again world";
        List<String> expected = Arrays.asList("Hello", "Hello", "again", "again", "again", "world");

        assertEquals(expected, LongWordList.longWordListExercise(sentence));
    }
}
