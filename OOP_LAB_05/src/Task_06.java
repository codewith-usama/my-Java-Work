/*

Q6: Create a billing application that generates the bill for A stationary shop
containing items shown in table below.
Initialize the stock using a member function (use 2D array for that)
Create a billing function that calculates total bill as per the quantity selected by
customer
Create another member function to show the invoice


Product code Price/product
1               20
2               25
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Task_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number of items: ");
        num = scan.nextInt();
        Shop s1 = new Shop(num);
        s1.Display();
        s1.Bill();

    }
}

class Shop {
    int[][]list;

    Scanner scan = new Scanner(System.in);

    Shop(int num) {
        list = new int[num][2];
        takeInput();
    }

    void takeInput() {
        System.out.println("Enter Product Code and Price: ");
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                list[i][j] = scan.nextInt();
            }
        }
    }

    void Display() {
        System.out.println("Code  Price");
        for(int i = 0; i < list.length; i++) {
            for(int j = 0; j < list.length; j++) {
                System.out.print(list[i][j] + "\t\t");
            }
            System.out.println();
        }
    }

    void Bill() {
        int amount = 0;
        for(int i = 0, j = 1; i < list.length; i++) {
            amount += list[i][j];
        }

        System.out.println("Total bill is: " + amount);
    }
}
