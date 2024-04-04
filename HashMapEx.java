import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        String inputString = "welcome to java program";

        String[] words = splitString(inputString);

        HashMap<String, Integer> wordCounts = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (wordCounts.containsKey(word)) {
                wordCounts.put(word, wordCounts.get(word) + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        System.out.println("Total Number of Words: " + words.length);
    }

    private static String[] splitString(String inputString) {
        StringBuilder wordBuilder = new StringBuilder();
        int wordCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != ' ') {
                wordBuilder.append(ch);
            } else {
                if (wordBuilder.length() > 0) {
                    wordCount++;
                    wordBuilder = new StringBuilder();
                }
            }
        }

        if (wordBuilder.length() > 0) {
            wordCount++;
        }

        String[] words = new String[wordCount];

        wordBuilder = new StringBuilder();
        int index = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch != ' ') {
                wordBuilder.append(ch);
            } else {
                if (wordBuilder.length() > 0) {
                    words[index++] = wordBuilder.toString();
                    wordBuilder = new StringBuilder();
                }
            }
        }

        if (wordBuilder.length() > 0) {
            words[index] = wordBuilder.toString();
        }

        return words;
    }
}
