import java.util.List;
import java.util.ArrayList;

public class twosum {

    public List<Integer> twoSum(List<Integer> list1, int target) {
        for (int i : list1) {
            List<Integer> result = new ArrayList<>();
            if (list1.contains(target - i)) {
                int complementIndex = list1.indexOf(target - i);
                if (complementIndex != list1.indexOf(i)) {
                    result.add(list1.indexOf(i));
                    result.add(list1.indexOf(target - i));
                    return result;
                }
            }

        }
        return null;
    }

    public static void main(String[] args) {
        twosum solver = new twosum();
        List<Integer> list1 = new ArrayList<>(List.of(1, 4, 5, 7, 8, 9));
        int target = 9;
        List<Integer> result = solver.twoSum(list1, target);
        System.out.println(result);
    }
}
