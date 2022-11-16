/*

TASK – 05:
Write a program which calculates the grace marks for a student in Object oriented
programming course using switch case. The user should enter the grade obtained by the
student and the number of assignments he has failed in.
 If the student gets A grade and the number of assignments, he failed in is greater than
3, then he does not get any grace. If the number of assignments he failed in is less than
or equal to 3 then the grace is of 5 marks.
 If the student gets B grade and the number of assignments, he failed in is greater than
2, then he does not get any grace. If the number of assignments he failed in is less than
or equal to 2 then the grace is of 4 marks.
 If the student gets C grade and the number of assignments, he failed in is greater than
1, then he does not get any grace. If the number of assignments he failed in is equal to
1, then the grace is of 5.
Display the appropriate output in each case.


 */



import java.util.Scanner;
public class Task_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter class of Student: ");
        int C = scan.nextInt();
        System.out.print("Enter number of failed assignment: ");
        int failed = scan.nextInt();

        switch (failed) {
            case 1:
                if(failed <= 3)
                    System.out.println("Grace makrs obtained is: " + failed*5);
                else
                    System.out.println("He didn'y get any grace");
                break;
            case 2:
                if(failed <= 2)
                    System.out.println("Grace makrs obtained is: " + failed*4);
                else
                    System.out.println("He didn'y get any grace");
                break;
            case 3:
                if(failed <= 1)
                    System.out.println("Grace makrs obtained is: " + failed*5);
                else
                    System.out.println("He didn'y get any grace");
                break;
        }
    }
}
