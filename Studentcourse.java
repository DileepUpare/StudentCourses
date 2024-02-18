import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    int marks;

    public Course(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Student {
    String name;
    String program;
    int semester;
    List<Course> courses;

    public Student(String name, String program, int semester) {
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new ArrayList<>();
    }

    public void registerCourse(Course course) {
        courses.add(course);
    }

    public List<String> getRegisteredCourses() {
        List<String> registeredCourses = new ArrayList<>();
        for (Course course : courses) {
            registeredCourses.add(course.name);
        }
        return registeredCourses;
    }

    public List<String> getFailingCourses() {
        List<String> failingCourses = new ArrayList<>();
        for (Course course : courses) {
            if (course.marks < 40) {
                failingCourses.add(course.name);
            }
        }
        return failingCourses;
    }
}

public class Studentcourse {
    public static void main(String[] args) {
        Course maths = new Course("C#", 75);
        Course physics = new Course("Machine Learning", 35);
        Course chemistry = new Course("Software Testing", 80);

        Student s1 = new Student("Dileep", "BCA", 4);
        s1.registerCourse(maths);
        s1.registerCourse(physics);
        s1.registerCourse(chemistry);

        // Activity 1: Retrieve student information
        System.out.println("Student Name: " + s1.name);
        System.out.println("Program: " + s1.program);
        System.out.println("Semester: " + s1.semester);
        System.out.println("Registered Courses: " + s1.getRegisteredCourses());

        // Activity 2: Retrieve failing courses
        System.out.println("\nFailing Courses: " + s1.getFailingCourses());
    }
}
