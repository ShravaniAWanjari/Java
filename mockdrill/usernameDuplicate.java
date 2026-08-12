package mockdrill;

import java.util.*;

class usernameDuplicate {

    private List<String> users;

    public usernameDuplicate(List<String> users) {
        this.users = users;
    }

    public List<String> getUniqueUsers() {
        Set<String> setUsers = new LinkedHashSet<>(users);

        return new ArrayList<>(setUsers);
    }

    public int getUserCount() {
        return users.size();
    }

    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of(
                "Amit", "Ravi", "Amit", "Neha", "Ravi", "Amit"));

        usernameDuplicate solver = new usernameDuplicate(users);
        System.out.println(solver.getUniqueUsers());
    }
}
