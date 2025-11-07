package collections;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeFiveSetExerciseTest {
    @Test
    @DisplayName("Check the result is a value divisible by 5")
    public void testInvalidValues() {
        MakeFiveSetExerciseTest input = new MakeFiveSetExerciseTest();
        HashSet<Integer> expected1 = new HashSet<>();
        expected1.add(5);
        expected1.add(10);
        expected1.add(15);
        expected1.add(20);
        expected1.add(25);
        expected1.add(30);
        assertEquals(expected1, MakeFiveSetExercise.makeFiveSet(30));

        assertEquals(new HashSet<>(), MakeFiveSetExercise.makeFiveSet(4));

    }

    @Test
    @DisplayName("Edge case: max = 5")
    public void testEdgeCase() {
        HashSet<Integer> expectedSingle = new HashSet<>();
        expectedSingle.add(5);
        assertEquals(expectedSingle, MakeFiveSetExercise.makeFiveSet(5));
    }
}
