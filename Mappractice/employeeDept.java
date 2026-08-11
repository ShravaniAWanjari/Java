package Mappractice;

import java.util.Map;

import mockdrill.Employee;
import mockdrill.employeeDept;

import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

class Employee {
    String name;
    String Dept;

    Employee(String name, String Dept) {
        this.name = name;
        this.Dept = Dept;
    }
}

public class employeeDept {
    public Map<String, List<String>> sortDept(List<Employee> employees) {
        Map<String, List<String>> userMap = new HashMap<>();
        for (Employee i : employees) {
            userMap.put(i.Dept, userMap.getOrDefault(i.Dept, new ArrayList<>()));
            userMap.get(i.Dept).add(i.name);
        }
        return userMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Amit", "Engineering"),
                new Employee("Ravi", "Sales"),
                new Employee("Neha", "Engineering"),
                new Employee("Priya", "HR"),
                new Employee("Rahul", "Sales")));

        employeeDept solution = new employeeDept();
        System.out.println(solution.sortDept(employees));
    }
}