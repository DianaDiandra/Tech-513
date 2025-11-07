package Exercises;

public class StringExercises {
    public static int countWords(String[] words, char c) {
        if (words == null) {
            throw new IllegalArgumentException("Array must not be null");
        }

        int count = 0;
        for (String word : words) {
            if (word != null && !word.isEmpty() &&
                    Character.toLowerCase(word.charAt(0)) == Character.toLowerCase(c)) {
                count++;

            }
        }
        return count;
    }

    public static int countWordsInString(String phrase, char c) {
        if (phrase == null) {
            throw new IllegalArgumentException("Input string must not be null");
        }

        String[] words = phrase.trim().split("[,\\s]+");
        return countWords(words, c);
    }

    public static String stringTransformations(String words, int i) {

        String trimmed = words.trim().toUpperCase();

        StringBuilder numbers = new StringBuilder();
        for (int n = 0; n < i; n++) {
            numbers.append(n);
        }
        return trimmed + numbers;
    }

    public static Boolean palindromeString(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String i = word.toLowerCase().replaceAll("\\s+", "");
        if (i.isEmpty()) {
            return false;
        }

        int left = 0;
        int right = i.length() - 1;

        while (left < right) {
            if (i.charAt(left) != i.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
