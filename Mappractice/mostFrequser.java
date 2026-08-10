package Mappractice;

import java.util.Map;
import java.util.HashMap;

public class mostFrequser {
    public String findFrequser(String[] users) {
        Map<String, Integer> userMap = new HashMap<>();
        int maxUserfreq = 0;
        String maxUser = "";

        for (String user : users) {
            userMap.put(user, userMap.getOrDefault(user, 0) + 1);
            if (userMap.get(user) > maxUserfreq) {
                maxUserfreq = userMap.get(user);
                maxUser = user;
            }
        }
        return maxUser;
    }

    public static void main(String[] args) {
        mostFrequser solver = new mostFrequser();
        String[] users = { "A101", "A102", "A101", "A103", "A102", "A101", "A102", "A102" };
        System.out.println(solver.findFrequser(users));
    }
}