/*

QUESTION#4
Write a Java program that prints all real solutions to the quadratic equation
ax2 + bx + c = 0. Read in a, b, c and use the quadratic formula.
 */

import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = scan.nextDouble();
        System.out.print("Enter B: ");
        double B = scan.nextDouble();
        System.out.print("Enter C: ");
        double C = scan.nextDouble();

        double d = B * B - 4.0 * A * C;

        if(d > 0) {
            double r1 = (-B - Math.pow(d, 0.5) / 2.0 * A);
            double r2 = (-B + Math.pow(d, 0.5) / 2.0 * A);
            System.out.println("Roots are: " + r1 + " and " + r2);
        }
        else if (d == 0) {
            double r1 = -B / 2.0 * A;
            System.out.println("Root of equation: " + r1);
        }
        else {
            System.out.println("No Real Root");
        }
    }
}
