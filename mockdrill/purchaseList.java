import java.util.*;

class Purchase {
    String user;
    int amount;

    Purchase(String user, int amount) {
        this.user = user;
        this.amount = amount;
    }
}

public class purchaseList {
    static Map<String, Integer> calcSpending(List<Purchase> purchases) {
        Map<String, Integer> userMap = new HashMap<>();
        for (Purchase i : purchases) {
            userMap.put(i.user, userMap.getOrDefault(i.user, 0) + i.amount);
        }
        return userMap;
    }

    public static void main(String[] args) {
        List<Purchase> purchases = new ArrayList<>(List.of(
                new Purchase("Aruna", 100),
                new Purchase("Josh", 200),
                new Purchase("Jia", 200),
                new Purchase("Aruna", 100),
                new Purchase("Josh", 200),
                new Purchase("Ash", 200)));
        System.out.println(calcSpending(purchases));
    }
}