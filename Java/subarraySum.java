package Java;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class subarraySum {

    public int countSubarrays(List<Integer> nums, int k) {
        Map<Integer, Integer> arrayMap = new HashMap<>();
        int subarrays = 0;
        int currentSum = 0;
        arrayMap.put(0, 1);
        for (int i : nums) {
            currentSum = currentSum + i;
            if (arrayMap.containsKey(currentSum - k)) {
                subarrays += arrayMap.get(currentSum - k);
            }
            arrayMap.put(currentSum, arrayMap.getOrDefault(currentSum, 0) + 1);

        }
        return subarrays;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        subarraySum solution = new subarraySum();
        int k = 10;
        System.out.println(solution.countSubarrays(nums, k));
    }
}
