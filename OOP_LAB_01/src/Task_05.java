/*

QUESTION#5
Write a Java program that inputs three integers from the user and displays the
sum, average, and product of these numbers.

*/
import java.util.Scanner;

public class Task_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A: ");
        double A = scan.nextDouble();
        System.out.print("Enter B: ");
        double B = scan.nextDouble();
        System.out.print("Enter C: ");
        double C = scan.nextDouble();

        System.out.println("A+B+C: "+ (A+B+C));
        System.out.println("Average is: "+ (A+B+C) / 3);
        System.out.println("A*B*C: "+ (A*B*C));
    }
}
