package Fundamentals;
import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        // using for loop for printing an array of size n
        for(int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
        System.out.println();
        // while loop, first check the condition and then execute the body

        int num = 2;
        while(num < 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // do while loop, 1st iteration will execute without any condition, from the next iteration, it
        // will check the condition and only then execute the body

        num = 0;
        do {
            System.out.print(num);
        }while(num != 0);


    }
}
