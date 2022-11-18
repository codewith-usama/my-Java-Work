/*

Q1: Create a class called Student that has attributes name, roll number and a
static attribute university name.
- Make a static variable counter and initialize it to 0.
- Make a static set method for roll number that increments the counter and
returns the counter.
- Create a parameterized constructor that sets the name as the parameter.
To set the roll number call the static set roll number method.
- Create a static method that takes a parameter and sets the university
name.
- Create a display method that displays the student’s information name, roll
number and university.
- In the main, call the set university name method and set it to “FAST
University”.
- Create three objects of the student class and display their information
along with their roll number that should be different for each student.

 */




public class Task_01 {
    public static void main(String[] args) {
        Student s1 = new Student("Mohammad Usama", "20K-0190");
        Student.setUniName("FAST");
        s1.Display();
        Student s2 = new Student("Mohammad Taha", "20K-0183");
        s2.Display();
        Student s3 = new Student("Masab", "20K-0123");
        s3.Display();
    }
}

class Student {
    static int count = 0;
    String name;
    String rollNo;
    static String uniName;


    static void setCount() {
        count++;
    }



    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
        setCount();
    }

    Student(String name, String rollNo) {
        this.name = name;
        setRollNo(rollNo);
    }


    static void setUniName(String universityName) {
        uniName = universityName;
    }
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("RollNo: " + rollNo);
        System.out.println("UniName: " + uniName);
        System.out.println("Count: " + count);
        System.out.println();
    }

}
