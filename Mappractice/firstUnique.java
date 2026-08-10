package Mappractice;

import java.util.Map;
import java.util.HashMap;

public class firstUnique {
    public String findUnique(String word) {
        String uniqueWord = "";
        Map<String, Integer> wordMap = new HashMap<>();
        for (String i : word.split("")) {
            wordMap.put(i, wordMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            String character = entry.getKey();
            Integer count = entry.getValue();
            if (count == 1) {
                return character;
            }
        }
        return uniqueWord;
    }

    public static void main(String[] args) {
        firstUnique solver = new firstUnique();
        String word = "aabbabcccdfegh";
        System.out.println(solver.findUnique(word));
    }
}