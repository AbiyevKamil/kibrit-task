import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    private static final Map<String, Integer> takenWords = new HashMap<String, Integer>();

    public static void take(String word) {
        if (takenWords.containsKey(word)) {
            var count = takenWords.get(word);
            takenWords.put(word, ++count);
            return;
        }
        takenWords.put(word, 1);
    }

    public static int count(String word) {
        if (takenWords.containsKey(word)) {
            var count = takenWords.get(word);
            return count;
        }
        return 0;
    }
}
