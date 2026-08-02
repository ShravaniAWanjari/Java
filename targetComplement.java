
import java.util.HashMap;
import java.util.Map;

public class targetComplement {
    public boolean findComplement(int[] numbers, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (seen.containsKey(complement)) {
                return true;
            }
            seen.put(numbers[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15, 20 };
        int target1 = 40;
        int target2 = 20;
        targetComplement comp = new targetComplement();

        System.out.println(comp.findComplement(nums, target1));
        System.out.println(comp.findComplement(nums, target2));

    }
}
