package mockdrill;

import java.util.*;

import java.util.*;

class ScoreService {

    private Map<String, Integer> scores;

    public ScoreService(Map<String, Integer> scores) {
        this.scores = scores;
    }

    public List<String> getUsersAboveScore(int threshold) {
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            if (entry.getValue() > threshold) {
                result.add(entry.getKey());
            }
        }
        return result;
    }

    public Integer getScore(String username) {
        return scores.get(username);
    }
}