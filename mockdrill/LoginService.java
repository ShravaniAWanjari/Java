package mockdrill;

import java.util.*;

class LoginService {

    private Map<String, Integer> loginAttempts;

    public LoginService(Map<String, Integer> loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public List<String> getUsersNeedingReview() {
        List<String> loginList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : loginAttempts.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            } else if (entry.getValue() >= 5) {
                loginList.add(entry.getKey());
            }
        }
        return loginList;
    }
}