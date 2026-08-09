import java.util.Map;
import java.util.HashMap;

public class countWords {

    public Map<String, Integer> wordCount(String sentence) {
        Map<String, Integer> wordcountMap = new HashMap<>();
        String[] newStringList = sentence.split(" ");

        for (String i : newStringList) {
            wordcountMap.put(i, wordcountMap.getOrDefault(i, 0) + 1);
        }
        return wordcountMap;
    }

    public static void main(String[] args) {
        String sentence = "This is NOT This but This instead and is a fruit but NOT apple";
        countWords solver = new countWords();
        System.out.println(solver.wordCount(sentence));
    }
}