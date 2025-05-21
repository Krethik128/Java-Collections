package javaeight.practiceworkshop.student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .toList();

        //1. Find the list of students whose rank is in between 50 and 100
        System.out.println("1.Find the list of students whose rank is in between 50 and 100");
        studentList.stream().
                filter(student -> student.getRank() >= 50 && student.getRank() <= 100)
                .forEach(students -> System.out.println(students.getFirstName() + " "));
        System.out.println("---");

        // 2.Find the Students who stays in Karnataka and sort them by their names
        System.out.println("2.Find the Students who stays in Karnataka and sort them by their names");
        List<Student> karnatakaStudentNames=studentList.stream()
                .filter(student -> student.getCity().equalsIgnoreCase("karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .toList();
        System.out.println("---");

        System.out.println("Students who stays in karnataka and their names in sorted");
        karnatakaStudentNames.forEach(object->System.out.print(object.getFirstName()+" "));
        System.out.println("---");

        // 3. Find all departments names
        System.out.println("3.All the department names");
        studentList.stream()
                .map(Student::getDept)
                .distinct()
                .forEach(System.out::println);
        System.out.println("---");

        //4. Find all the contact numbers
        System.out.println("4.All the contact nums ");
        List<String> contactNum=studentList.stream()
                .flatMap(student -> student.getContacts().stream())
                .distinct()
                .toList();
        System.out.println(contactNum);
        System.out.println("---");


        //Group The Student-By-Department Names
        System.out.println("5.Group The Student By Department Names ");
        studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept))
                .forEach((deptName, students2) -> {
                    System.out.println(deptName);
                        students2.forEach(student ->
                            System.out.println(student.getFirstName()));
        });
        System.out.println("---");

        //6. Find the department with the maximum number of students
        System.out.println("6. Find the department with the maximum number of students:");
        String deptWithMaxStudents = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No department");

        System.out.println("Max students are in: " + deptWithMaxStudents);
        System.out.println("---");


        System.out.println("7.Find the average age of male and female students");
        System.out.println(studentList.stream()
                .collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge))));
        System.out.println("---");


        System.out.println("8.Find the highest rank in each department");
          studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept))
                .forEach((deptName, students2) -> {
                    System.out.println(deptName);
                    students2.stream()
                            .max(Comparator.comparingInt(Student::getRank))
                            .ifPresentOrElse(
                                    student -> System.out.println("Name " + student.getFirstName() + " marks " + student.getRank()),
                                    () -> System.out.println("Not present")
                            );
                }
        );
        System.out.println("---");


        System.out.println("9.Find the student who has second rank");
         studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept))
                .forEach((deptName, students2) -> {
                    System.out.println("Dept Name: " + deptName);
                    students2.stream()
                            .sorted(Comparator.comparingInt(Student::getRank))
                            .skip(1)
                            .findFirst()
                            .ifPresentOrElse(
                                    student -> System.out.println("Name " + student.getFirstName() + " marks " + student.getRank()),
                                    () -> System.out.println("Not present"));
                });
        System.out.println("---");

// 10. To Count the occurrence of each character in a string
        System.out.println("10. Count character occurrences in a string:");
        String testString = "ilovejavatechie";
        Map<Character, Long> charCounts = testString.chars() // IntStream
                .mapToObj(c -> (char) c) // Stream<Character>
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("String: " + testString);
        System.out.println("Character counts: " + charCounts);
        System.out.println("---");

        // 11. To Find all duplicate element from a given string
        System.out.println("11. Find duplicate characters in a string:");
        String dupString = "programming";
        Set<Character> duplicateChars = dupString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
        System.out.println("String: " + dupString);
        System.out.println("Duplicate characters: " + duplicateChars);
        System.out.println("---");

        // 12. First non-repeating character
        System.out.println("12. First non-repeating character in a string:");
        String nonRepeatString = "swiss";
        Optional<Character> firstNonRepeating = nonRepeatString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting())) // Preserve order
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println("String: " + nonRepeatString);
        firstNonRepeating.ifPresent(c -> System.out.println("First non-repeating: " + c));
        if (!firstNonRepeating.isPresent()) {
            System.out.println("No non-repeating character found.");
        }
        System.out.println("---");

        // 13. To find the second largest from an array
        System.out.println("13. Second largest from an array:");
        int[] numbersArray = {5, 9, 3, 2, 8, 7, 4, 9, 1};
        OptionalInt secondLargest = Arrays.stream(numbersArray)
                .distinct() // Handle duplicates if they affect "second largest" definition
                .boxed() // Convert IntStream to Stream<Integer>
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .mapToInt(Integer::intValue)
                .findFirst();
        System.out.println("Array: " + Arrays.toString(numbersArray));
        secondLargest.ifPresent(n -> System.out.println("Second largest: " + n));
        if (!secondLargest.isPresent() && Arrays.stream(numbersArray).distinct().count() < 2) {
            System.out.println("Not enough distinct elements to find a second largest.");
        }
        System.out.println("---");

        // 14. To find the longest string in an list/array
        System.out.println("14. Longest string in a list:");
        List<String> stringList = Arrays.asList("Java", "Python", "JavaScript", "C++", "Go");
        Optional<String> longestString = stringList.stream()
                .max(Comparator.comparingInt(String::length));
        System.out.println("List: " + stringList);
        longestString.ifPresent(s -> System.out.println("Longest string: " + s));
        System.out.println("---");

        // 15. to find max number in array
        System.out.println("15. Max number in an array:");
        int[] anotherNumbersArray = {10, 5, 20, 8, 15};
        OptionalInt maxNumber = Arrays.stream(anotherNumbersArray).max();
        System.out.println("Array: " + Arrays.toString(anotherNumbersArray));
        maxNumber.ifPresent(n -> System.out.println("Max number: " + n));
        System.out.println("---");

        // 16. to find the element start with 1 (assuming list of strings)
        System.out.println("16. Elements starting with '1' (from a list of strings):");
        List<String> numStrings = Arrays.asList("123", "234", "100", "310", "11");
        List<String> startsWithOne = numStrings.stream()
                .filter(s -> s.startsWith("1"))
                .collect(Collectors.toList());
        System.out.println("List: " + numStrings);
        System.out.println("Elements starting with '1': " + startsWithOne);
        System.out.println("---");

        // 17. String.join example
        System.out.println("17. String.join example:");
        List<String> namesToJoin = Arrays.asList("Alice", "Bob", "Charlie");
        String joinedNames = String.join(", ", namesToJoin);
        System.out.println("Joined names: " + joinedNames);
        System.out.println("---");

        // 18. skip and limit methods example (using studentList)
        System.out.println("18. skip(2) and limit(3) example on student list (sorted by ID):");
        List<Student> skippedAndLimitedStudents = studentList.stream()
                .sorted(Comparator.comparingInt(Student::getId)) // Ensure order for consistent skip/limit
                .skip(2)  // Skip the first 2 students
                .limit(3) // Take the next 3 students
                .collect(Collectors.toList());
        skippedAndLimitedStudents.forEach(s -> System.out.println(s.getFirstName()));
        System.out.println("---");
    }
}
