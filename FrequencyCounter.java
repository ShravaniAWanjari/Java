
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public Map<Character, Integer> countCharacters(String s) {

        Map<Character, Integer> counts = new HashMap<>();
        for (char ch : s.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        String s = "abbssbbddjejjee";
        FrequencyCounter counter = new FrequencyCounter();
        System.out.println(counter.countCharacters(s));
    }
}