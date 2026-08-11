package mockdrill;

import java.util.*;

class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }
}

public class employeeDept {
    static Map<String, List<String>> groupEmployees(List<Employee> employees) {
        Map<String, List<String>> employeeMap = new HashMap<>();
        for (Employee i : employees) {
            employeeMap.computeIfAbsent(i.department, k -> new ArrayList<>()).add(i.name);
        }
        return employeeMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Arial", "Engineering"),
                new Employee("Priya", "Research"),
                new Employee("Riya", "Medical"),
                new Employee("Rahul", "Sales"),
                new Employee("Neha", "Engineering"));

        System.out.println(groupEmployees(employees));
    }
}
