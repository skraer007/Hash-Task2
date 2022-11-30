import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    private String text;

    public WordsChecker(String text) {
        this.text = text;
    }

    public boolean hasWord(String word) {
        Set<String> wordsInSet = new HashSet<>();
        String[] wordsInArray = text.split("\\P{IsAlphabetic}+");
        Collections.addAll(wordsInSet, wordsInArray);
        return wordsInSet.contains(word);
    }
}