package mockdrill;

import java.util.*;

public class greaterscore {
    public static void printPassed(Map<String, Integer> scores) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();

            if (score > 60) {
                System.out.println(name + " " + score);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of(
                "Amit", 70,
                "Ravi", 45,
                "Neha", 85,
                "Priya", 60);

        printPassed(scores);
    }
}