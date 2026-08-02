import java.util.*;

public class firstUniqueChar {
    public int firstUniqueCharacter(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (countMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "aa";
        String s1 = "aab";
        String s2 = "aaabbabc";
        firstUniqueChar unique = new firstUniqueChar();
        System.out.println(unique.firstUniqueCharacter(s));
        System.out.println(unique.firstUniqueCharacter(s1));
        System.out.println(unique.firstUniqueCharacter(s2));
    }
}
