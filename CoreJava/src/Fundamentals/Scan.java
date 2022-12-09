package Fundamentals;
import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        /* Java Scanner Class is used to take input from user,
        * first we will create an object of Class Scanner and use it for taking input,
        * celow is an example of this */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        System.out.println("Number Entered " + num);

    }
}
