import java.util.*;

public class findduplicateSet {
    static List<String> findDuplicates(List<String> transactions) {
        Set<String> duplicates = new LinkedHashSet<>();
        Set<String> seen = new LinkedHashSet<>();

        for (String i : transactions) {
            if (seen.contains(i)) {
                duplicates.add(i);
            } else {
                seen.add(i);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static void main(String[] args) {
        List<String> transactions = List.of(
                "T101", "T102", "T103",
                "T101", "T104", "T102",
                "T105", "T103", "T101");

        System.out.println(findDuplicates(transactions));

    }

}