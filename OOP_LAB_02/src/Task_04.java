/*

TASK – 04:
Write a program that specifies whether a given number (x) falls in one of the following
categories:
• 0 to 9
• 10 to 19
• 20 to 29
• None of the categories
For example, if x = 5, program should print "0 to 10", and if x = 44 it should print "None".
Hint: use if statements with Boolean expressions combined using &&
 */

import java.util.Scanner;
public class Task_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int x = scan.nextInt();
        if(x >= 0 && x <= 9)
            System.out.println("0-9");
        if(x >= 10 && x <= 19)
            System.out.println("10-19");
        if(x >= 20 && x <= 29)
            System.out.println("20-29");
        if(x > 29)
            System.out.println("None of the categories");
    }
}
