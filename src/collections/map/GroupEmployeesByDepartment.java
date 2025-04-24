package collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class GroupEmployeesByDepartment {
    static class Employee {
        String name;
        String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        @Override
        public String toString() {
            return name;
        }

        public String getDepartment() {
            return department;
        }
    }
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<String, List<Employee>> departmentMap = new HashMap<>();
        for (Employee employee : employees) {
            departmentMap.computeIfAbsent(employee.department, k -> new ArrayList<>()).add(employee);
        }
        return departmentMap;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", "HR"));
        employees.add(new Employee("Bob", "IT"));
        employees.add(new Employee("Carol", "HR"));
        //Using Map
        Map<String, List<Employee>> groupedByDept = groupByDepartment(employees);
        groupedByDept.forEach((dept, empList) -> System.out.println(dept + ": " + empList));
        //or using Streams
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)));
    }
}
