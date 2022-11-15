/*

QUESTION#3
Write a Java program that works as a simple calculator for the +, -,*, / operations.
Take two integer numbers from the user and perform all the four operations.
 */





import java.util.Scanner;
public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter number 1: ");
            float a = sc.nextFloat();
            System.out.print("Enter number 2: ");
            float b = sc.nextFloat();
            System.out.print("Enter Operation (+,-,*,/): ");
            String c = sc.next();
            switch (c) {
                case "+":
                    System.out.println("A + B = : " + (a + b));
                    break;
                case "-":
                    System.out.println("A + B = : " + (a - b));
                    break;
                case "*":
                    System.out.println("A + B = : " + (a * b));
                    break;
                case "/":
                    System.out.println("A + B = : " + (a / b));
                    break;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
            System.out.print("An other Operation (yes/no):");
            String check = sc.next();
            if(check == "yes" || check == "y")
                continue;
            else
                break;

        }
    }
}