/*

TASK – 04:
 Write a program that describes a class Student. It should have instance variables to record
name, age, StudentID, Course Name and Course teacher for OOP.
 Create a Student object. Set and display its instance variables.


 */




import java.util.Scanner;

public class Task_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String studentName = scan.nextLine();

        System.out.print("Enter Student ID: ");
        String studentID = scan.nextLine();

        System.out.print("Enter Student Age: ");
        int Age = scan.nextInt();

        System.out.print("Enter Instructor Name: ");
        String courseInstructor = scan.nextLine();

        System.out.print("Enter Course Name: ");
        String courseName = scan.nextLine();

        Student s1 = new Student(studentName, Age, studentID, courseName, courseInstructor);
        s1.Display();
    }
}


class Student {
    protected String Name;
    protected int Age;
    protected String StudentID;
    protected String CourseName;
    protected String CourseInstructor;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseInstructor() {
        return CourseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        CourseInstructor = courseInstructor;
    }

    Student(String Name, int Age, String StudentID, String CourseName, String CourseIstructor) {
        this.Name = Name;
        this.Age = Age;
        this.StudentID = StudentID;
        this.CourseName = CourseName;
        this.CourseInstructor = CourseIstructor;
    }

    void Display() {
        System.out.println();
        System.out.println("Student Name: " + this.Name);
        System.out.println("Student ID: " + this.StudentID);
        System.out.println("Age: " + this.Age);
        System.out.println("Course Name: " + this.CourseName);
        System.out.println("Course Instructor: " + this.CourseInstructor);
    }
}
