import java.util.HashMap;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            while (freq.containsKey(rightChar)) {
                char leftChar = s.charAt(left);
                if (freq.get(leftChar) == 1) {
                    freq.remove(leftChar);
                } else {
                    int charcount = freq.get(leftChar);
                    freq.put(leftChar, charcount - 1);
                }
                left += 1;
            }

            freq.put(rightChar, freq.getOrDefault(rightChar, 0) + 1);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        binarySearch solver = new binarySearch();
        int result = solver.lengthOfLongestSubstring("abcabcbb");
        System.out.println("Result: " + result);
    }
}
