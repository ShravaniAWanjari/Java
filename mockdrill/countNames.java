package mockdrill;

import java.util.*;

public class countNames {
    static Map<String, Integer> countpeople(List<String> names) {

        Map<String, Integer> counter = new HashMap<>();
        for (String i : names) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
        return counter;
    }

    public static void main(String[] args) {
        List<String> names = List.of();

        System.out.println(countpeople(names));
    }
}