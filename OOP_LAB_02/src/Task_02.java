/*


TASK – 02:
Write a program that asks the user to enter two numerical values (integers) and then select an
operation (addition, subtraction, multiplication and division) then prints the result based on
operation selected. The code below shows examples of the output (text shown in boldface is
supposed to be user input).
Input:
Enter first number: 4
Enter second number: 2
1. Addition (+).
2. Subtraction (-).
3. Multiplication (*).
4. Division (/).
Enter operation number: 3
Output:
The result is 8

 */

import java.util.Scanner;

public class Task_02 {
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
            if(check != "y")
                break;
        }
    }
}
