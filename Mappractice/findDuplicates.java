import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class findDuplicates {
    public List<String> sortDuplicates(List<String> transactions) {
        Map<String, Integer> duplicateMap = new HashMap<>();
        List<String> duplicateList = new ArrayList<>();

        for (String i : transactions) {
            duplicateMap.put(i, duplicateMap.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : duplicateMap.entrySet()) {
            String transaction = entry.getKey();
            Integer count = entry.getValue();

            if (count > 1) {
                duplicateList.add(transaction);
            }
        }
        return duplicateList;
    }

    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>(List.of("T101", "T102", "T103", "T101", "T104", "T102", "T105"));
        findDuplicates solver = new findDuplicates();
        System.out.println(solver.sortDuplicates(transactions));
    }
}