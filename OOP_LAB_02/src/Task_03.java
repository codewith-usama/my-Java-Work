/*

TASK – 03:
Take numbers as input from user. Write a Java program to find largest of three numbers.
 */
import java.util.Scanner;
import java.lang.Math;
public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Num 1: ");
        int A = scan.nextInt();
        System.out.print("Enter Num 2: ");
        int B = scan.nextInt();
        System.out.print("Enter Num 3: ");
        int C = scan.nextInt();

        System.out.println("Max Number: " + Math.max(A, Math.max(B, C)));
    }
}
