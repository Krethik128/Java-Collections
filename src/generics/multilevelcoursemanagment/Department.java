package generics.multilevelcoursemanagment;

import java.util.ArrayList;
import java.util.List;

class Department {
    private String departmentName;
    private List<Course<?>> coursesOffered; // List of courses, can be any CourseType

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.coursesOffered = new ArrayList<>();
    }

    public String getDepartmentName() {
        return departmentName;
    }

    // Method to add a course to the department
    public void addCourse(Course<?> course) {
        coursesOffered.add(course);
    }

    // Method to get all courses offered by the department
    public List<Course<?>> getCoursesOffered() {
        return coursesOffered;
    }

    // Method to display courses using a wildcard
    public void displayCourses() {
        System.out.println("Courses offered by " + departmentName + ":");
        for (Course<?> course : coursesOffered) {
            System.out.println(course);
        }
    }
}
