/*

TASK – 01:
Body Mass Index (BMI) Calculator: Body Mass Index (BMI) is a person's weight in
kilograms divided by the square of height in meters. Formula given for reference.
𝐵𝑀𝐼 =
𝑊𝑒𝑖𝑔ℎ𝑡 𝑖𝑛 𝐾𝑔
[ℎ𝑒𝑖𝑔ℎ𝑡 𝑖𝑛 𝑀𝑒𝑡𝑟𝑒𝑠]
2
Create a BMI calculator application that reads the user’s weight in kilograms and height in
meters, then calculates and displays the user’s body mass index. The program should ask the
user to input values at run-time. Also, the application should display the following
information so the user can evaluate his/her BMI:
Input: weight in Kg, height in meters
Output: given below in tabular form

BMI values          Output
Less than 18.5      Underweight
18.5 – 24.9         Normal
25 – 29.9           Overweight
30 or above         Obese


 */

import java.util.Scanner;


public class Task_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter weight in kg: ");
        double Weight = scan.nextDouble();
        System.out.print("Enter Height in Meter: ");
        double Height = scan.nextDouble();
        double BMI = Weight / (Height * Height);

        if(BMI < 18.5)
            System.out.println("Underweight");
        else if(BMI > 18.5 && BMI < 24.9)
            System.out.println("Normal");
        else if(BMI > 25 && BMI < 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
