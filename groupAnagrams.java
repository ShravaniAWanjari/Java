import java.util.*;

public class groupAnagrams {
    public List<List<String>> countAnagrams(String[] strings) {
        Map<String, List<String>> sortedmap = new HashMap<>();
        for (String s : strings) {
            char[] sortedS = s.toCharArray();
            Arrays.sort(sortedS);
            String sorted = new String(sortedS);
            if (!sortedmap.containsKey(sorted)) {
                sortedmap.put(sorted, new ArrayList<>());
            }
            sortedmap.get(sorted).add(s);
        }

        return new ArrayList<>(sortedmap.values());
    }

    public static void main(String[] args) {
        String[] strings = { "aee", "eae", "rfe", "fera", "eea" };
        groupAnagrams anagrams = new groupAnagrams();
        System.out.println(anagrams.countAnagrams(strings));
    }
}
