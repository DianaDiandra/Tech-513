package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongWordList {

    public static List<String> longWordListExercise(String sentence) {
        List<String> longWords = new ArrayList<>();

        Pattern pattern = Pattern.compile("\\b[a-zA-Z]+(?:['-][a-zA-Z]+)*\\b");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            String word = matcher.group();
            if (word.length() >= 5) {
                longWords.add(word);
            }
        }
        return longWords;
    }
}
