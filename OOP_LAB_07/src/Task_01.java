/*

TASK 1:
Write a Java program that has a class named as Employee.
▪ The class Employee has a default constructor that displays “I am an employee”.
▪ It has the attributes name, position, number of years, and salary. Initialize the salary
to 30000.
▪ Input all the details from the user and display them using input and display function
respectively.
Derive a class FulltimeEmployee.
▪ The class has a default constructor that displays “I am a full time employee in the
company”.
▪ The class has an attribute increment initialized to 20%.
▪ The class has a function that displays the incremented salary of a full time employee.
Derive a class PartTimeEmployee.
▪ The class has a default constructor that displays “I am a part time employee in the
company”.
▪ The class has an attribute increment initialized to 5%.
▪ The class has a function that displays the incremented salary of a part time employee.
In the main, display all the details as required.

 */

import java.util.Scanner;
public class Task_01 {
    public static void main(String[] args) {
        PartTimeEmployee p1 = new PartTimeEmployee();
        p1.inputDetails();
        p1.display();
        FullTimeEmployee f1 = new FullTimeEmployee();
        f1.inputDetails();
        f1.display();

    }
}

class Employee {
    protected String name;
    protected String position;
    protected int numOfYear;
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumOfYear() {
        return numOfYear;
    }

    public void setNumOfYear(int numOfYear) {
        this.numOfYear = numOfYear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    Scanner scan = new Scanner(System.in);

    Employee() {
        System.out.println("I am an Employee");
        name = null;
        position = null;
        numOfYear = 0;
        salary = 30000F;
    }

    void inputDetails() {
        System.out.print("Enter your Name: ");
        name = scan.nextLine();
        System.out.print("Your Position: ");
        position = scan.nextLine();
        System.out.print("Number of Year Worked: ");
        numOfYear = scan.nextInt();
    }

    void display() {
        System.out.println("Name of Employee: " + name);
        System.out.println("Position: " + position);
        System.out.println("Number of Years Worked: " + numOfYear);
        System.out.println("salary: " + salary);
    }
}

class FullTimeEmployee extends Employee {
    protected int increment;

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    FullTimeEmployee() {
        super();
        increment = 20;
        System.out.println("I am a full time Employee in the company");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Incremented salary of full time Employee: " + (double)((salary*increment)+salary));
    }
}

class PartTimeEmployee extends Employee{
    protected int increment;

    public int getIncrement() {
        return increment;
    }

    public void setIncrement(int increment) {
        this.increment = increment;
    }

    PartTimeEmployee() {
        super();
        increment = 5;
        System.out.println("I am a part time Employee in the company");
    }

    @Override
    void display() {
        super.display();
        System.out.println("Incremented salary of full time Employee: " + (double)((salary*increment)+salary));
    }
}

