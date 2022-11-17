/*

TASK – 05:
Write a program that creates a class circle with instance variables for radius. Initialize the variable using
a constructor dynamically. Create a function calculate area and display the area for a circle.

 */

import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Radius of the Circle: ");
        float radius = scan.nextFloat();
        Circle circle = new Circle(radius);
        circle.Area();
    }
}


class Circle {
    protected float Radius;
    Circle (float radius) {
        Radius = radius;
    }

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float radius) {
        Radius = radius;
    }

    float area;
    void Area() {
        area = (float)3.14 * (this.Radius * this.Radius);
        System.out.println("Area of Circle: " + area);
    }
}