package generics.multilevelcoursemanagment;

class Course<T extends CourseType> {
    private String courseName;
    private String courseCode;
    private T courseType; // Holds the specific type of course

    public Course(String courseName, String courseCode, T courseType) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseType = courseType;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public T getCourseType() {
        return courseType;
    }

    @Override
    public String toString() {
        return "Course: " + courseName + " (" + courseCode + "), Type: " + courseType;
    }
}
