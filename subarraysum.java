import java.util.*;

public class subarraySum {
    public int sumk(List<Integer> nums, int k) {
        int count = 0;
        int currentSum = 0;
        Map<Integer, Integer> prefixmap = new HashMap<>();
        prefixmap.put(0, 1);
        for (int i : nums) {
            currentSum += i;
            if (prefixmap.containsKey(currentSum - k)) {
                count += prefixmap.get(currentSum - k);
            }
            prefixmap.put(currentSum, prefixmap.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 4, 2, 3, 4, 2, 6, 7));
        int k = 8;
        subarraySum solver = new subarraySum();
        System.out.println(solver.sumk(nums, k));
    }
}
