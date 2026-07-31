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
        Map<String, Integer> studentlist = Map.of(
                "Rohit", 70,
                "neha", 80,
                "Nisha", 50);

        printPassed(studentlist);
    }
}
