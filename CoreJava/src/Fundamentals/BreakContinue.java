package Fundamentals;

public class BreakContinue {
    public static void main(String[] args) {
        // break is used to break the loop, for example if you are printing an array until 0 comes

        int[] arr = {1, 2, 3, 4, 4, 9, 0, 1, 2, 3};

        for(int i = 0; i < arr.length; i++) { // it will print array upto 9
            if(arr[i] == 0)
                break;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // continue itself tells that is used to continue the loop but skip the current iteration

        for(int i = 0; i < arr.length; i++) { // it will print all the array except 0
            if(arr[i] == 0)
                continue;
            System.out.print(arr[i] + " ");
        }
    }
}
