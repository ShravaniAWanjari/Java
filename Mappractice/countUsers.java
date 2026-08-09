import java.util.Map;
import java.util.HashMap;

public class countUsers {
    public Map<String, Integer> countUser(String[] users) {
        Map<String, Integer> counts = new HashMap<>();
        for (String i : users) {
            counts.put(i, counts.getOrDefault(i, 0) + 1);
        }
        return counts;
    }

    public static void main(String[] args) {
        String[] users = { "A101", "A102", "A101", "A103", "A102", "A101" };
        countUsers solver = new countUsers();
        System.out.println(solver.countUser(users));
    }
}