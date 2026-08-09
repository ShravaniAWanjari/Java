package Mappractice;

import java.util.Map;
import java.util.HashMap;

public class userscoreThreshold {
    public void scorecalc(Map<String, Integer> scores, int minimum) {
        for (String key : scores.keySet()) {
            if (scores.get(key) >= minimum) {
                System.out.println(key);
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> users = new HashMap<>(Map.of(
                "Josh", 90,
                "Marsha", 80,
                "emily", 40,
                "paris", 78,
                "holly", 60,
                "Jake", 45));
        int minimum = 60;

        userscoreThreshold solver = new userscoreThreshold();
        solver.scorecalc(users, minimum);
    }
}