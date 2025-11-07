package collections;

import java.util.HashSet;
import java.util.stream.IntStream;

public class MakeFiveSetExercise {
    public static HashSet<Integer> makeFiveSet(int max) {
        HashSet<Integer> result = new HashSet<>();

        IntStream.rangeClosed(1, max).forEach(i -> {
            if (i % 5 == 0) {
                result.add(i);
            }
        });

        return result;
    }
}
