package Java;

import java.util.List;
import java.util.ArrayList;

public class twosum {

    public List<Integer> twoSum(List<Integer> list1, int target) {
        for (int i : list1) {
            List<Integer> result = new ArrayList<>();
            if (list1.contains(target - i)) {
                int currentIndex = list1.indexOf(i);
                int complementIndex = list1.lastIndexOf(target - i);
                if (complementIndex != list1.indexOf(i)) {
                    result.add(currentIndex);
                    result.add(complementIndex);
                    return result;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        twosum solver = new twosum();
        List<Integer> list1 = new ArrayList<>(List.of(3, 3, 4, 5, 7, 8, 9));
        int target = 6;
        List<Integer> result = solver.twoSum(list1, target);
        System.out.println(result);
    }
}
