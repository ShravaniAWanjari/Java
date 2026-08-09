package Mappractice;

import java.util.Map;
import java.util.HashMap;

public class userScore {
    public Integer getScore(Map<String, Integer> scores, String userName) {
        Integer score = scores.get(userName);
        return score;
    }

    public static void main(String[] args) {
        Map<String, Integer> userMap = new HashMap<>(Map.of(
                "Amit", 75,
                "Ravi", 52,
                "Neha", 91));
        String User1 = "Amit";
        String User2 = "Aakash";

        userScore solver = new userScore();
        Integer result1 = solver.getScore(userMap, User1);
        Integer result2 = solver.getScore(userMap, User2);
        if (result1 != null) {
            System.out.println(result1);
        } else {
            System.out.println("User not found");
        }
        if (result2 != null) {
            System.out.println(result2);
        } else {
            System.out.println("User not found");
        }
    }
}