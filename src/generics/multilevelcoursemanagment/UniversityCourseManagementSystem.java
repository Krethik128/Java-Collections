package generics.multilevelcoursemanagment;

public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        // Create departments
        Department computerScience = new Department("Computer Science");
        Department physics = new Department("Physics");

        // Create courses with specific course types
        Course<ExamCourse> programing = new Course<>("Introduction to Programming", "CS101", new ExamCourse());
        Course<AssignmentCourse> dsa = new Course<>("Data Structures", "CS201", new AssignmentCourse());
        Course<ResearchCourse> quantumPhysics = new Course<>("Quantum Mechanics", "PH301", new ResearchCourse());
        Course<ExamCourse> physic = new Course<>("Introduction to Physics", "PH101", new ExamCourse());

        // Add courses to departments
        computerScience.addCourse(programing);
        computerScience.addCourse(dsa);
        physics.addCourse(quantumPhysics);
        physics.addCourse(physic);

        // Display courses offered by each department
        computerScience.displayCourses();
        System.out.println();
        physics.displayCourses();
    }
}

