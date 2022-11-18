/*

Q3: Create a class named Average Purchase that will contains an array of size n, if
the user has made 3 orders today then then array size will be 3 for today.
Now, create a function to take input of the today’s purchases.
Create another function to display the array.
Create a function to calculate the average purchases done today

 */


import java.util.Scanner;

public class Task_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of purchased items: ");
        int num = scan.nextInt();

        AveragePurchase a1 = new AveragePurchase(num);
        a1.DisplayItems();
        a1.calAvg();
    }
}

class AveragePurchase {
    int n;
    int [] arr;
    Scanner scan = new Scanner(System.in);
    void takeItems() {
        for(int i = 0; i < n; i++) {
            System.out.print("Enter Item " + (i+1) + ": ");
            arr[i] = scan.nextInt();
        }
    }
    AveragePurchase(int n) {
        this.n = n;
        arr = new int[n];
        takeItems();
    }

    void DisplayItems() {
        for(int i = 0; i < n; i++)
            System.out.println("Item " + (i+1) + ": " + arr[i]);
    }

    void calAvg() {
        int sum = 0;
        for(int i = 0; i < n; i++)
            sum += arr[i];

        System.out.println("Average is purchased items is: " + (sum/n));
    }

}
