package javaeight.streams.practiceproblems.employeesNamesUsingStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Problem {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("Alice", 60000d),
                new Employee("Bob", 45000d),
                new Employee("Charlie", 70000d),
                new Employee("David", 50000d),
                new Employee("Eve", 80000d)
        );

       List<String> newList= list.stream()
               .filter( x->x.salary>50000)
               .map(Employee::getName)
               .sorted((s1,s2)->s1.length()-s1.length())
               .collect(Collectors.toList());
        System.out.println("Names of guys above 50000 salary are sorted");
        System.out.println(newList);

    }
}
