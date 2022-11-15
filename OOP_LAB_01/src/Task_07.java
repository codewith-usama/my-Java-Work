/*

QUESTION#7
Write a Java program that takes as input your name, student ID, current courses
registered for and displays all the information.

 */

import java.util.Scanner;

public class Task_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String Name = scan.nextLine();
        System.out.print("Enter Your ID: ");
        int ID = scan.nextInt();
        System.out.print("Enter Number of Courses : ");
        int num = scan.nextInt();
        String [] courses = new String[num];

        for(int i = 0; i < courses.length; i++) {
            courses[i] = scan.next();
        }
        System.out.println("Name: " + Name);
        System.out.println("ID: " + ID);
        System.out.println("Courses: ");

        for(int i = 0; i < courses.length; i++) {
            System.out.println(courses[i]);
        }
    }
}
