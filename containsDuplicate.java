import java.util.Map;
import java.util.HashMap;

public class containsDuplicate {
    public boolean containsNearrbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mapmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (mapmap.containsKey(nums[i])) {
                int diff = Math.abs(i - mapmap.get(nums[i]));
                if (diff <= k) {
                    return true;
                }
            }
            mapmap.put(nums[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 3, 5, 2, 4, 6 };
        int k1 = 1;
        int k2 = 5;
        int k3 = 10;
        containsDuplicate solver = new containsDuplicate();
        System.out.println(solver.containsNearrbyDuplicate(nums, k1));
        System.out.println(solver.containsNearrbyDuplicate(nums, k2));
        System.out.println(solver.containsNearrbyDuplicate(nums, k3));

    }
}