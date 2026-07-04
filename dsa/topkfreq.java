import java.util.HashMap;
import java.util.PriorityQueue;

public class topkfreq{
    public int[] topKFrequent(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        for (int num : nums){
           map.put(num,map.getOrDefault(num,0) + 1);
        }

        for (int key : map.keySet()){
            maxHeap.add(key);
        }

        int[] result = new int[k];
        
        for (int i = 0; i <k ; i++){
            result[i] = maxHeap.poll();
        }

        return result;
    }
}