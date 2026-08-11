package mockdrill;

import java.util.*;

class UserService {

    private List<String> users;

    public UserService(List<String> users) {
        this.users = users;
    }

    public int getUserCount() {
        if (users.isEmpty()) {
            return 0;
        } else {
            return users.size();
        }
    }

    public void printUsers() {
        for (String user : users) {
            System.out.println(user);
        }
    }
}