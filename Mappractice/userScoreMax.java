
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class userScoreMax {
    public void maxScorer(Map<String, Integer> scores) {
        Integer maxScore = null;
        List<String> topScorer = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String username = entry.getKey();
            Integer score = entry.getValue();

            if (maxScore == null) {
                maxScore = score;
                topScorer.add(username);
            } else if (score > maxScore) {
                topScorer.clear();
                maxScore = score;
                topScorer.add(username);
            } else if (score.equals(maxScore)) {
                topScorer.add(username);
            }
        }
        for (String i : topScorer) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>(Map.of(
                "Amit", 75,
                "Ravi", 52,
                "Neha", 91,
                "Riya", 91));

        userScoreMax solver = new userScoreMax();
        solver.maxScorer(scores);
    }
}