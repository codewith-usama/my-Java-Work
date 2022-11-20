/*

QUESTION#2
Write a Java program that has a class named “Person”.
 The class has a default constructor that displays “I am a person”.
 The class has attributes name, age, nationality, address and CNIC.
 The class has an input function that prompts the user to enter all the details. For
CNIC, the total number of digits should be exactly 13. If it’s less than 13 or
greater display an error message.
 The class also has a display function that displays all the details.

Derive a class Employee from Person.
 The class Employee has a default constructor that invokes the base class’s
constructor and displays “I am an Employee”.
 The class has the attributes name of company, company’s location (city), no of
years worked.
 The class has an input function that prompts the user to enter all the details. It
also has a display function that displays all the details.

Derive a class Manager from Employee.
 The class Manager has a default constructor that invokes the base class’s
constructor and displays “I am a Manager”.
 The class has an array that contains the names of employee’s who are working
under the manager’s supervision. Input atleast five employee’s in the array from
the user and display all these employee’s too.
In the main program, call all the functions and display the details.

 */

import java.util.Scanner;
public class Task_02 {
    public static void main(String[] args) {
        Manager ob1 = new Manager();
        ob1.inputDetails();
        ob1.Display();
    }
}

class Person {
    protected String name;
    protected int age;
    protected String nationality;
    protected String address;

    protected String cnic;

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    Scanner scan = new Scanner(System.in);

    Person() {
        System.out.println("I am a Person");
    }

    void inputDetails() {
        System.out.print("Enter your Name: ");
        name = scan.nextLine();
        System.out.print("Enter Age: ");
        age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Nationality: ");
        nationality = scan.nextLine();
        System.out.print("Enter your Address: ");
        address = scan.nextLine();

        while (true) {
            System.out.print("Enter Your CNIC: ");
            cnic = scan.next();
            if(cnic.length() == 13)
                break;
            System.out.println("Error, Enter valid CINC");
        }
    }

    void Display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("Address: " + address);
        System.out.println("CNIC: " + cnic);

    }
}

class Employee extends Person {
    protected String companyName;
    protected String companyLocation;
    protected int numOfYearWork;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }

    public int getNumOfYearWork() {
        return numOfYearWork;
    }

    public void setNumOfYearWork(int numOfYearWork) {
        this.numOfYearWork = numOfYearWork;
    }

    Employee() {
        super();
        System.out.println("I am an employee");
    }

    @Override
    void inputDetails() {
        super.inputDetails();
        System.out.print("Enter Company Name: ");
        scan.nextLine();
        scan.nextLine();
        System.out.print("Ennter Company's Location: ");
        companyLocation = scan.nextLine();
        System.out.print("Enter Number of years Worked: ");
        numOfYearWork = scan.nextInt();
        scan.nextLine();
    }

    @Override
    void Display() {
        super.Display();

        System.out.println("Employee's Company: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Number of Years Worked: " + numOfYearWork);
    }
}

class Manager extends Employee {
    protected String [] nameOfEmployees = new String[5];

    public String[] getNameOfEmployees() {
        return nameOfEmployees;
    }

    public void setNameOfEmployees(String[] nameOfEmployees) {
        this.nameOfEmployees = nameOfEmployees;
    }

    Manager() {
        super();
        System.out.println("I am a Manager");
    }

    @Override
    void inputDetails() {
        super.inputDetails();
        System.out.println("Enter Employees Name under the supervision of Manager: ");
        for(int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i+1) + ": ");
            nameOfEmployees[i] = scan.nextLine();
        }
    }

    @Override
    void Display() {
        super.Display();

        System.out.println("Below are the Employees Under the supervision of Manager: ");
        for(String name: nameOfEmployees)
            System.out.println(name);
    }
}