import java.util.*;

public class topfreqK {
    public List<Integer> topK(List<Integer> nums, int k) {
        Map<Integer, Integer> mapmap = new HashMap<>();

        for (int i : nums) {
            mapmap.put(i, mapmap.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (a, b) -> mapmap.get(a) - mapmap.get(b));

        for (int key : mapmap.keySet()) {
            minHeap.add(key);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(minHeap.poll());
        }

        return result;

    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 2, 2, 1, 5, 5, 5, 6));
        int k = 3;
        topfreqK solver = new topfreqK();
        System.out.println(solver.topK(nums, k));
    }
}