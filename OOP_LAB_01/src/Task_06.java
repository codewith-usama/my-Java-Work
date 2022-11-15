/*

QUESTION#6
Write a Java program that inputs from the user the radius of a circle as an integer
and prints the circle’s diameter, circumference and area using the floating-point
value 3.14159 for π

*/

import java.util.Scanner;
public class Task_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Radius: ");
        int radius = scan.nextInt();
        double diameter = radius * 2;
        double pi = 3.14156;
        double circumference = (2 * pi * radius);
        double area = (2 * pi);
        System.out.println("Diameter of circle: " + diameter);
        System.out.println("circumference of circle: " + circumference);
        System.out.println("Area of circle: " + area);
    }
}
