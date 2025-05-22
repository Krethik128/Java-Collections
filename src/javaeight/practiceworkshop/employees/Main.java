package javaeight.practiceworkshop.employees;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = Stream.of(
                new Employee(101, "Alice", "HR", 26, 55000, "Pune", Arrays.asList("alice@company.com", "alice.hr@company.com")),
                new Employee(102, "Bob", "Finance", 33, 72000, "Delhi", Arrays.asList("bob@company.com")),
                new Employee(103, "Charlie", "IT", 28, 88000, "Bangalore", Arrays.asList("charlie@company.com", "charlie.dev@company.com")),
                new Employee(104, "David", "HR", 35, 67000, "Pune", Arrays.asList("david.hr@company.com")),
                new Employee(105, "Eve", "IT", 29, 99000, "Delhi", Arrays.asList("eve@company.com")),
                new Employee(106, "Frank", "Finance", 41, 120000, "Mumbai", Arrays.asList("frank@company.com")),
                new Employee(107, "Grace", "Marketing", 25, 45000, "Pune", Arrays.asList("grace@company.com")),
                new Employee(108, "Heidi", "IT", 31, 110000, "Bangalore", Arrays.asList("heidi@company.com", "heidi.it@company.com")),
                new Employee(109, "Ivan", "Finance", 38, 78000, "Chennai", Arrays.asList("ivan@company.com")),
                new Employee(110, "Judy", "Marketing", 27, 48000, "Delhi", Arrays.asList("judy@company.com"))
        ).toList();

        // 1. List all employees working in Pune, sorted by name
        System.out.println("Employees in Pune (sorted by name):");
        List<Employee> puneEmployeesSorted = employeeList.stream()
                .filter(emp -> emp.getCity().equalsIgnoreCase("pune"))
                .sorted(Comparator.comparing(Employee::getName)) // Using method reference
                .toList();
        puneEmployeesSorted.forEach(emp -> System.out.println("- " + emp.getName()));

        // 2. Find all employees in IT department younger than 30
        System.out.println("\nEmployees in IT department under 30:");
         employeeList.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("IT") && emp.getAge()<30)
                 .forEach(emp -> System.out.println("- " + emp.getName()));

        // 3. Create a list of all email addresses
        System.out.println("\nAll email addresses:");
        List<String> allEmails = employeeList.stream()
                .flatMap(emp -> emp.getEmails().stream())
                .distinct() // Optional: if you want only unique emails
                .collect(Collectors.toList()); // Java 8 way
        System.out.println(allEmails);

        // 4. Find if all employees are from the same city.
        System.out.println("\nAre all employees from the same city?");
        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.mapping(Employee::getName, Collectors.toList())))
                .forEach((city, names) -> {
                    System.out.println(city + ": " + String.join(", ", names));
                });

        // 5. Salary-based queries:
        // 5a. Find the 3rd highest-paid employee
        System.out.println("\n3rd highest-paid employee:");
        employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2) // Skip the first two highest paid
                .findFirst()
                .ifPresentOrElse(
                        employee -> System.out.println(employee.getName() + " with salary: " + employee.getSalary()),
                        () -> System.out.println("Not enough employees to determine the 3rd highest salary.")
                );

        // 5b. Get the next 3 highest-paid employees after skipping the first 2 (i.e., 3rd, 4th, 5th highest paid)
        System.out.println("\n3rd, 4th, and 5th highest-paid employees:");
         employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(2) // Skip top 2
                .limit(3) // Take the next 3
                .forEach(emp -> System.out.println("- " + emp.getName() + " with salary: " + emp.getSalary()));


        // 6. Group employees by city and find the average salary in each city.
        System.out.println("\nAverage salary by city:");
                employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getCity, Collectors.averagingDouble(Employee::getSalary)))
                        .forEach((city, avgSalary) ->
                System.out.println(city + ": " + String.format("%.2f", avgSalary))
        );
    }
}
