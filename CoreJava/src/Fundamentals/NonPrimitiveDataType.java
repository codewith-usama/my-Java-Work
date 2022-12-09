package Fundamentals;
import java.util.Scanner;
public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        // 1-D array
        int[] arr1 = new int[5];
        System.out.println("Enter value 1-D array");
        for(int i = 0; i < arr1.length; i++)
            arr1[i] = scan.nextInt();

        // 2-D array
        int [][] arr2 = new int[3][3];
        System.out.println("Enter value 2-D array");
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2.length; j++)
                arr2[i][j] = scan.nextInt();
        }

        // printing String
        System.out.println("String Entered: " + str);

        //printing 1-D array
        System.out.println("1-D Array");
        for(int i = 0; i < arr1.length; i++)
            System.out.print(arr1[i] + " ");

        //printing 2-D array
        System.out.println();
        System.out.println("2-D Array");
        for(int i = 0; i < arr2.length; i++) {
            for(int j = 0; j < arr2.length; j++)
                System.out.print(arr2[i][j] + " ");
            System.out.println();
        }
    }

}
