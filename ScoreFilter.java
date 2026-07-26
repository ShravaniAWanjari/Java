import java.util.*;

public class ScoreFilter {
    static void printPassed(Map<String, Integer> scores) {
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();

            if (score > 60) {
                System.out.println(name);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = Map.of(
                "Amit", 70,
                "Ravi", 75,
                "Neha", 85);

        printPassed(scores);
    }
}