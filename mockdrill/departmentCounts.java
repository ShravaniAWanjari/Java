package mockdrill;

import java.util.*;

public class departmentCounts {
    static Map<String, Integer> countDepartments(List<String> departments) {
        Map<String, Integer> deptcountlist = new HashMap<>();

        for (String i : departments) {
            deptcountlist.put(i, deptcountlist.getOrDefault(i, 0) + 1);
        }
        return deptcountlist;
    }

    public static void main(String[] args) {
        List<String> departments = List.of(
                "Engineering",
                "Sales",
                "Engineering",
                "HR",
                "Sales",
                "Engineering");

        System.out.println(countDepartments(departments));
    }
}