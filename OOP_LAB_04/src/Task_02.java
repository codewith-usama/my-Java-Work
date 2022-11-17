/*

2. Create a new class Student with the following attributes:
- studentID (int)
- name (string)
- cgpa (float)
- department (string)
Implement setter/getter functions for these variables and implement the following constructors:
a) A constructor that receives parameters to initialize all variables
b) A constructor that receives only studentID as input and initialize other variables by taking
input from the user
c) A constructor that receives only cgpa as input and does not initialize other variables.
Create objects of Student class in main function using each constructor.

 */


import java.util.Scanner;
import java.io.*;

public class Task_02 {
    public static void main(String[] args) {
        Student s1 = new Student(190, "Mohammad Usama", 3.1F, "CS");
        s1.Diaplay();
        Student s2 = new Student(190);
        s2.Diaplay();
        Student s3 = new Student(3.1F);
        s3.Diaplay();
    }
}
class Student {
    protected int StudentID;
    protected String Name;
    protected float cgpa;
    protected String Department;

    Scanner scan = new Scanner(System.in);

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    Student(int ID, String Name, float cgpa, String dpt) {
        StudentID = ID;
        this.Name = Name;
        this.cgpa = cgpa;
        Department = dpt;
    }

    Student (int ID) {
        StudentID = ID;
        System.out.print("Enter your Name: ");
        Name = scan.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = scan.nextFloat();
        System.out.print("Enter your Department: ");
        Department = scan.nextLine();
    }
    Student (float cpga) {
        this.cgpa = cgpa;
        Name = null;
        Department = null;
        StudentID = 0;
    }

    void Diaplay() {
        System.out.println("Name: " + Name  + "\nID " + StudentID + "\nCGPA " + cgpa + "" +
                "\nDepartment: " + Department);
        System.out.println();
    }

}
