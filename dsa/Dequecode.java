import java.util.ArrayDeque;
import java.util.Deque;

public class Dequecode{

    public int[] maxSlidingWindow(int[] nums, int k){
        int n = nums.length;
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++){
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.addLast(i);

            if (dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            if (i>= k - 1){
                result[i-k+1] = nums[dq.peekFirst()];
            }
        } 

        return result;
    }
}