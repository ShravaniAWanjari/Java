import java.util.Stack;

public class dailyTemperatures {
    public int[] temps(int[] temperatures) {

        Stack<Integer> st = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > st.peek()) {
                int prevIndex = st.pop();
                answer[prevIndex] = temperatures[st.peek()] - temperatures[prevIndex];
            }
            st.push(i);
        }

        return answer;

    }
}
