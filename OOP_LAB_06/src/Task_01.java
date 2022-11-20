/*

QUESTION#1
Write a Java program that has a class named “Course”.
 The class Course has the attributes course name, course code, class venue and
credit hours, all are protected members.
 Set all these attributes with a parameterized constructor.
 Derive a class “Java Course” that has an attribute teacher name.
 Make a constructor and invoke the base class’s parameterized constructor.
 Set the teacher name in the constructor.
 The derived class has a function Display that displays all the details of the course
and the derived class.
 In the main, display all the details

 */

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Course Name: ");
        String courseName = scan.nextLine();
        System.out.print("Enter Course Code: ");
        String courseCode = scan.nextLine();
        System.out.print("Enter Class Venue: ");
        String classVenue = scan.nextLine();
        System.out.print("Credit Hour: ");
        int creditHour = scan.nextInt();
        scan.nextLine();
        System.out.print("Teacher Name: ");
        String teacherName = scan.nextLine();

        JavaCourse java1 = new JavaCourse(courseName, courseCode, classVenue, creditHour, teacherName);
        java1.Display();

    }
}

class Course {
    protected String courseName;
    protected String courseCode;
    protected String classVenue;
    protected int creditHour;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getClassVenue() {
        return classVenue;
    }

    public void setClassVenue(String classVenue) {
        this.classVenue = classVenue;
    }

    public int getCreditHour() {
        return creditHour;
    }

    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }

    Course(String courseName, String courseCode, String classVenue, int creditHour) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.classVenue = classVenue;
        this.creditHour = creditHour;
    }
}

class JavaCourse extends Course {
    protected String teacherName;

    JavaCourse(String courseName, String courseCode, String classVenue, int creditHour, String teacherName) {
        super(courseName, courseCode, classVenue, creditHour);
        this.teacherName = teacherName;
    }
    void Display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Class Venue: " + classVenue);
        System.out.println("Credit Hour: " + creditHour);
        System.out.println("Teacher Name: " + teacherName);
    }
}