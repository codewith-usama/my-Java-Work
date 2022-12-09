package Fundamentals;

public class IfElse {
    public static void main(String[] args) {
        int num = 20;
        /* check first for the if, if true execute it's body otherwise check else if and so in */

        if(num < 2)
            System.out.println("Less than 2");
        else if (num < 10)
            System.out.println("UnderAge");
        else if(num < 18)
            System.out.println("Not eligible");
        else
            System.out.println("Eligible");
    }
}
